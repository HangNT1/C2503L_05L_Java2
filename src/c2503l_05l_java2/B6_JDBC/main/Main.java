/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B6_JDBC.main;

import c2503l_05l_java2.B6_JDBC.entity.SinhVien;
import c2503l_05l_java2.B6_JDBC.service.SinhVienService;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        SinhVienService service = new SinhVienService();
        System.out.println("1. them");
        System.out.println("2. sua");
        System.out.println("3. xoa");
        System.out.println("4. hien thi");
        System.out.println("4. thoat");
        Scanner sc = new Scanner(System.in);
        List<SinhVien> lists = service.findAll();
        while (true) {
            System.out.println("xin moi ban nhap: ");
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose) {
                case 1:
                    // Nhap tu ban phim : nen la ham service -> chua quen viet o day 
//                    SinhVien sv = new SinhVien();
//                    System.out.println("Moi nhap ten:");
//                    String ten = sc.nextLine();
                    // nhap tu ban phim tuong tu cac thuoc tinh khac 

                    service.addSinhVien(service.getThongTinSinhVien());
                    break;
                case 2:
                    lists = service.sapXep(); // gan lai gia tri cho bien lists
                    service.inThongTin(lists);
                    break;
                case 3:
                    System.out.println("Moi nhap ma can xoa:");
                    int maCanXoa = Integer.valueOf(sc.nextLine());
                    service.delete(maCanXoa);
                    break;
                case 4:
                    service.inThongTin(lists);
                    // for 
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang k ton tai: ");
            }

        }
    }
}
