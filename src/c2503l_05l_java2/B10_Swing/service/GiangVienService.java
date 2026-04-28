/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B10_Swing.service;

import c2503l_05l_java2.B10_Swing.entity.GiangVien;
import c2503l_05l_java2.B10_Swing.repository.GiangVienRepository;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class GiangVienService {

    private GiangVienRepository giangVienRepository = new GiangVienRepository();

    public List<GiangVien> getAll() {
        return giangVienRepository.getAll();
    }

    public GiangVien getOne(String ma) {
        return giangVienRepository.getOne(ma);
    }

    public String addGiangVien(GiangVien gv) {
        if (giangVienRepository.addGiangVien(gv)) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

    public String updateGiangVien(GiangVien gv, String maCanUpdate) {
        if (giangVienRepository.updateGiangVien(gv, maCanUpdate)) {
            return "Update thanh cong";
        }
        return "Update that bai";
    }

    public String removeGiangVien(String maCanXoa) {
        if (giangVienRepository.removeGiangVien(maCanXoa)) {
            return "Xoa thanh cong";
        }
        return "Xoa that bai";
    }
}
