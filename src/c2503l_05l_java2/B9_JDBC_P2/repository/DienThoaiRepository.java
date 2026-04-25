/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B9_JDBC_P2.repository;

import c2503l_05l_java2.B9_JDBC_P2.entity.DienThoai;
import c2503l_05l_java2.B9_JDBC_P2.entity.Hang;
import c2503l_05l_java2.B9_JDBC_P2.util.JDBCConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DienThoaiRepository {
    
    private HangRepository hangRepository = new HangRepository();
    
    public List<DienThoai> getAll() {
        List<DienThoai> listSinhVien = new ArrayList<>();
        // madt, ten, mau sac, gia, so luong, ten hang dien thoai
        String sql = """
                    SELECT dt.ma, dt.ten , dt.mau_sac , dt.gia , dt.so_luong ,h.ma_hang  
                     FROM dien_thoai dt, hang h 
                     WHERE dt.ma_hang  = h.ma_hang 
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DienThoai dt = new DienThoai();
                dt.setMa(rs.getInt(1));
                dt.setTen(rs.getString(2));
                dt.setMauSac(rs.getString(3));
                dt.setGia(rs.getDouble(4));
                dt.setSoLuong(rs.getInt(5));
                int maHang = rs.getInt(6);
                // Tim hang dua vao ma hang: 
                // SELECT * FROM hang WHERE ma hang -> GET 
                // -> HangRepository
                Hang h = hangRepository.getOne(maHang);
                dt.setHang(h);
                listSinhVien.add(dt);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listSinhVien;
    }

    public static void main(String[] args) {
        List<DienThoai> lists = new DienThoaiRepository().getAll();
        lists.forEach(s -> System.out.println(s));
    }
}
