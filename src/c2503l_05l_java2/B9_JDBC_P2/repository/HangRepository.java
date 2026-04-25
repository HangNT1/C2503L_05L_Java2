/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B9_JDBC_P2.repository;

import c2503l_05l_java2.B9_JDBC_P2.entity.Hang;
import c2503l_05l_java2.B9_JDBC_P2.util.JDBCConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hangnt
 */
public class HangRepository {

    public Hang getOne(int id) {
        String sql = """
                     SELECT *
                     FROM hang WHERE ma_hang = ?
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Hang h = new Hang();
                h.setMa(rs.getInt(1));
                h.setTen(rs.getString(2));
                return h;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
