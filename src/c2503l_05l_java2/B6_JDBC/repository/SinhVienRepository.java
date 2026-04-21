/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B6_JDBC.repository;

import c2503l_05l_java2.B6_JDBC.entity.SinhVien;
import c2503l_05l_java2.B6_JDBC.util.JDBCConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hangnt
 */
public class SinhVienRepository {

    // Lam viec truc tiep vs CSDL: chua cac ham goi trong CSDL ra 
    // CRUD: create, read, update, delete 
    // C -> CREATE -> INSRERT INTO 
    // R -> READ -> SELECT 
    // U -> UPDATE 
    // D -> DELETE 
    // GET ALL - READ: nhieu ket qua -> LIST 
    public List<SinhVien> getAll() {
        List<SinhVien> listSinhVien = new ArrayList<>();
        // Code 
        // B1: Viet cau lenh SQL theo mong muon 
        String sql = """
                     SELECT ma,tuoi,ten, gioi_tinh, nganh_hoc, diem_trung_binh
                     FROM sinh_vien
                     """;
        // B2: Mo cong ket noi: Connection -> try..with resource 
        // B3: Yeu cau Java tao cau lenh SQL => Prepar...
        // getJDBCConnection -> static k dung tu khoa new 
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            // Bang sql -> ResultSet: doi vs nhung cau SELECT
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // du lieu con -> true 
                // k con ban ghi -> false 
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getInt("ma")); // ten cọt
                sv.setTuoi(rs.getInt(2)); // vi tri cua cot trong du lieu tra ra 
                sv.setTen(rs.getString(3));
                sv.setGioiTinh(rs.getBoolean(4));
                sv.setNganhHoc(rs.getString(5));
                sv.setDiemTrungBinh(rs.getDouble(6));
                // add phan tu sv vao list 
                listSinhVien.add(sv);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listSinhVien;
    }

    // tim kiem theo khoá chính: R -> 1 
    public SinhVien getOne(int id) {
        // Code 
        // B1: Viet cau lenh SQL theo mong muon 
        String sql = """
                     SELECT ma,tuoi,ten, gioi_tinh, nganh_hoc, diem_trung_binh
                     FROM sinh_vien WHERE ma = ?
                     """;
        // B2: Mo cong ket noi: Connection -> try..with resource 
        // B3: Yeu cau Java tao cau lenh SQL => Prepar...
        // getJDBCConnection -> static k dung tu khoa new 
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            // set gia tri cho dau ? 
            ps.setObject(1, id);
//            ps.setObject(2, ten);
            // Bang sql -> ResultSet: doi vs nhung cau SELECT
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // du lieu con -> true 
                // k con ban ghi -> false 
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getInt("ma")); // ten cọt
                sv.setTuoi(rs.getInt(2)); // vi tri cua cot trong du lieu tra ra 
                sv.setTen(rs.getString(3));
                sv.setGioiTinh(rs.getBoolean(4));
                sv.setNganhHoc(rs.getString(5));
                sv.setDiemTrungBinh(rs.getDouble(6));
                return sv;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // add -> CREATE 
    public boolean add(SinhVien sv) {
        int check = 0; // false 
        // B1: Viet SQL 
        String sql = """
                     INSERT INTO sinh_vien (ten, tuoi, gioi_tinh, nganh_hoc, diem_trung_binh) VALUES
                     (?,?,?,?,?)
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            // co bn dau ? thi co bang day set
            ps.setObject(1, sv.getTen());
            ps.setObject(2, sv.getTuoi());
            ps.setObject(3, sv.isGioiTinh());
            ps.setObject(4, sv.getNganhHoc());
            ps.setObject(5, sv.getDiemTrungBinh());
            // excute Update 
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check > 0; // true: neu add thanh cong 
    }

    // UPDATE 
    public boolean update(SinhVien svUpdate, int idCanUpdate) {
        int check = 0; // false 
        // B1: Viet SQL 
        String sql = """
                    UPDATE sinh_vien
                    SET ten = ?, tuoi = ?, gioi_tinh = ?, nganh_hoc = ?, diem_trung_binh = ?
                    WHERE ma = ?
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            // co bn dau ? thi co bang day set
            ps.setObject(1, svUpdate.getTen());
            ps.setObject(2, svUpdate.getTuoi());
            ps.setObject(3, svUpdate.isGioiTinh());
            ps.setObject(4, svUpdate.getNganhHoc());
            ps.setObject(5, svUpdate.getDiemTrungBinh());
            ps.setObject(6, idCanUpdate);
            // excute Update 
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check > 0; // true: neu add thanh cong 
    }

    // DELETE
    public boolean delete(int id) {
        int check = 0; // false 
        // B1: Viet SQL 
        String sql = """
                    DELETE FROM sinh_vien WHERE ma = ?
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            // co bn dau ? thi co bang day set
            ps.setObject(1, id);
            // excute Update 
            check = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check > 0; // true: neu add thanh cong 
    }

    public static void main(String[] args) {
        System.out.println(new SinhVienRepository().getAll());
    }
}
