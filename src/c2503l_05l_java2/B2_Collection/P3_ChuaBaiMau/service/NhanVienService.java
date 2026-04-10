/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P3_ChuaBaiMau.service;

import c2503l_05l_java2.B2_Collection.P3_ChuaBaiMau.entity.NhanVien;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class NhanVienService {
    // dua vao chuc nang => main co bn chuc nang
    // service co toi thieu bang day ham 

    public void nhapThongTinNhanVien(List<NhanVien> lists) {
        // Nhap thong tin doi tuong Nhan Vien
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma nhan vien:");
        String maNhanVien = sc.nextLine();
        System.out.println("Moi nhap ma nhan vien:");
        String ten = sc.nextLine();
        System.out.println("Moi nhap ma nhan vien:");
        int bac = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap ma nhan vien:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap ma nhan vien:");
        boolean gioiTinh = Boolean.valueOf(sc.nextLine());
        // Tao doi tuong Nhan Vien 
        NhanVien nv = new NhanVien(maNhanVien, ten, bac, tuoi, gioiTinh);
        // them phan tu vao list 
        lists.add(nv);
    }

    public void inDanhSachNhanVien(List<NhanVien> lists) {
        lists.forEach(s -> s.inThongTin());
    }

    public void xoaDanhSachNhanVien(List<NhanVien> lists, String ma) {
        // check ma ton tai -> throw 
        lists.removeIf(nv -> nv.getMaNhanVien().equalsIgnoreCase(ma));
    }

    public List<NhanVien> timKiemTheoMa(List<NhanVien> lists, String ma) {
//        for (NhanVien nv : lists) {
//            if (nv.getMaNhanVien().equalsIgnoreCase(ma)) {
//                nv.inThongTin();
//            }
//        }
        return lists.stream()
                .filter(nv -> nv.getMaNhanVien().equalsIgnoreCase(ma))
                .toList();
    }
}
