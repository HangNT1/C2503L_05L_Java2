/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P3_ChuaBaiMau.main;

import c2503l_05l_java2.B2_Collection.P3_ChuaBaiMau.entity.NhanVien;
import c2503l_05l_java2.B2_Collection.P3_ChuaBaiMau.service.NhanVienService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        NhanVienService service = new NhanVienService();
        List<NhanVien> listNhanVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // in menu 
        while (true) {
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
                    service.nhapThongTinNhanVien(listNhanVien);
                    break;
                case 2:
                    service.inDanhSachNhanVien(listNhanVien);
                    break;
                case 3:
                    System.out.println("Moi nhap ma can xoa");
                    String maCanXoa = sc.nextLine();
                    service.xoaDanhSachNhanVien(listNhanVien, maCanXoa);
                    // DS sau khi xoa
                    service.inDanhSachNhanVien(listNhanVien);
                    break;
                case 4:
                    System.out.println("Moi nhap ma can tim");
                    String maCanTim = sc.nextLine();
                    service.timKiemTheoMa(listNhanVien, maCanTim);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai");
                    break;
            }
        }
    }
}
