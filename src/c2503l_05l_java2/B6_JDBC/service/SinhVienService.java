/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B6_JDBC.service;

import c2503l_05l_java2.B6_JDBC.entity.SinhVien;
import c2503l_05l_java2.B6_JDBC.repository.SinhVienRepository;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    private SinhVienRepository sinhVienRepository = new SinhVienRepository();

    public List<SinhVien> findAll() {
        return sinhVienRepository.getAll();
    }

    // tu liet ke cac ham ben repo 
    public String addSinhVien(SinhVien sv) {
        boolean checked = sinhVienRepository.add(sv);
        if (checked) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

    public String updateSinhVien(SinhVien sv, int ma) {
        boolean checked = sinhVienRepository.update(sv, ma);
        if (checked) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

    public String delete(int ma) {
        boolean checked = sinhVienRepository.delete(ma);
        if (checked) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }
}
