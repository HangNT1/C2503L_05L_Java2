/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B12_Swing_P2.repository;

import c2503l_05l_java2.B12_Swing_P2.entity.Sach;
import c2503l_05l_java2.B12_Swing_P2.util.JDBCConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SachRepository {

    public List<Sach> getAll() {
        List<Sach> lists = new ArrayList<>();
        String sql = """
                   SELECT ma, ten, tac_gia, gia, so_luong, ma_the_loai
                    FROM quan_ly_sach.sach;
                    """;
        try (Connection con = JDBCConnect.getJDBCConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lists.add(new Sach(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getDouble(4), rs.getInt(5),
                        rs.getInt(6)));
            }
            return lists;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Sach getOne(int ma) {
        String sql = """
                   SELECT ma, ten, tac_gia, gia, so_luong, ma_the_loai
                    FROM quan_ly_sach.sach WHERE ma = ?;
                    """;
        try (Connection con = JDBCConnect.getJDBCConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Sach(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getDouble(4), rs.getInt(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new SachRepository().getAll());
    }
}
