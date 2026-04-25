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
            if (rs.next()) {
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

    // Tim kiem theo khoang gia tri cu the: Tim kiem theo khoang tuoi
    public List<SinhVien> timKiemTheoKhoangTuoi(int tuoiMin, int tuoiMax) {
        List<SinhVien> listSinhVien = new ArrayList<>();
        String sql = """
                     SELECT * 
                     FROM sinh_vien
                     WHERE tuoi >= ? AND tuoi <= ?
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, tuoiMin);
            ps.setObject(2, tuoiMax);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getInt(1));
                sv.setTuoi(rs.getInt(3));
                sv.setTen(rs.getString(2));
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

    // Tim kiem theo 1 gia tri cu the: Tim kiem theo diem trung binh
    public List<SinhVien> timKiemDiemTrungBinh(double dtb) {
        List<SinhVien> listSinhVien = new ArrayList<>();
        String sql = """
                     SELECT * 
                     FROM sinh_vien
                     WHERE diem_trung_binh = ?
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, dtb);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getInt(1));
                sv.setTuoi(rs.getInt(3));
                sv.setTen(rs.getString(2));
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

    // Tim kiem chua ten/bat dau bang/ket thuc bang
    public List<SinhVien> timKiemTen(String name) {
        List<SinhVien> listSinhVien = new ArrayList<>();
        String sql = """
                     SELECT * 
                     FROM sinh_vien
                     WHERE ten LIKE ?
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getInt(1));
                sv.setTuoi(rs.getInt(3));
                sv.setTen(rs.getString(2));
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

    // Sap xep
    public List<SinhVien> sapXep() {
        List<SinhVien> listSinhVien = new ArrayList<>();
        // Code 
        // B1: Viet cau lenh SQL theo mong muon 
        String sql = """
                     SELECT ma,tuoi,ten, gioi_tinh, nganh_hoc, diem_trung_binh
                     FROM sinh_vien
                     ORDER BY tuoi 
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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

    public List<SinhVien> phanTrang(int pageNo, int pageSize) {
        List<SinhVien> listSinhVien = new ArrayList<>();
        // Code 
        // B1: Viet cau lenh SQL theo mong muon 
        String sql = """
                     SELECT ma,tuoi,ten, gioi_tinh, nganh_hoc, diem_trung_binh
                     FROM sinh_vien
                     LIMIT ? OFFSET ?
                     """;
        try (Connection con = JDBCConnect.getJDBCConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            int offset = (pageNo -1)* pageSize;
            ps.setObject(1, pageSize);
            ps.setObject(2, offset);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getInt("ma")); // ten cọt
                sv.setTuoi(rs.getInt(2)); // vi tri cua cot trong du lieu tra ra 
                sv.setTen(rs.getString(3));
                sv.setGioiTinh(rs.getBoolean(4));
                sv.setNganhHoc(rs.getString(5));
                sv.setDiemTrungBinh(rs.getDouble(6));
                listSinhVien.add(sv);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listSinhVien;
    }

    public static void main(String[] args) {
        String name = "a";
        System.out.println(new SinhVienRepository().timKiemTen(name));
    }
}
