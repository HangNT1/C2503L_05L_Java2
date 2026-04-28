/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B10_Swing.repository;

import c2503l_05l_java2.B10_Swing.entity.GiangVien;
import c2503l_05l_java2.B10_Swing.util.JDBCConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hangnt
 */
public class GiangVienRepository {

    // CRUD 
    // 19:45 - 20:20 
    public List<GiangVien> getAll() {
        List<GiangVien> lists = new ArrayList<>();
        String sql = """
                    SELECT ma, ten, tuoi, bac, loai_giang_vien, gioi_tinh
                    FROM QLGV.Giang_vien;
                    """;
        try (Connection con = JDBCConnect.getJDBCConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // lombox -> thu tu contructor full ts
                // thu tu khai bao bien ben entity
                lists.add(new GiangVien(rs.getString(1), rs.getInt(3),
                        rs.getString(2), rs.getInt(4), rs.getInt(5), rs.getBoolean(6)));
            }
            return lists;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public GiangVien getOne(String ma) {
        return null;
    }

    public boolean addGiangVien(GiangVien gv) {
        return true;
    }

    public boolean updateGiangVien(GiangVien gv, String maCanUpdate) {
        return true;
    }

    public boolean removeGiangVien(String maCanXoa) {
        return true;
    }

    // viet xong cac ham -> test main
    public static void main(String[] args) {
        System.out.println(new GiangVienRepository().getAll());
    }
}
