/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B12_Login.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import c2503l_05l_java2.B12_Login.entity.User;
import c2503l_05l_java2.B12_Login.util.JDBCConnect;

/**
 *
 * @author hangnt
 */
public class UserRepository {

    public User login(String username, String password) {
        String sql = """
                    SELECT * FROM users WHERE username = ? AND password = ? 
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement pr = con.prepareStatement(sql)) {
            pr.setObject(1, username);
            pr.setObject(2, password);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setRole(rs.getString(4));
                return user;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        UserRepository ur = new UserRepository();
        System.out.println(ur.login("admin", "123"));
    }
}
