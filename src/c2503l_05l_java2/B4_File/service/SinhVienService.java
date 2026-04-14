/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B4_File.service;

import c2503l_05l_java2.B4_File.entity.SinhVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienService() {
        // them 5 phan tu 
        lists.add(new SinhVien("SV01", "Nguyen Van A", 10));
        lists.add(new SinhVien("SV02", "Nguyen Van A", 10));
        lists.add(new SinhVien("SV03", "Nguyen Van A", 10));
        lists.add(new SinhVien("SV04", "Nguyen Van A", 10));
        lists.add(new SinhVien("SV05", "Nguyen Van A", 10));
    }

    public void addSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhao tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        SinhVien sv = new SinhVien(ma, ten, tuoi);
        lists.add(sv);
    }

    public void hienThi() {
        lists.forEach(System.out::println);
    }

    public void setLists(List<SinhVien> lists) {
        this.lists = lists;
    }

    public List<SinhVien> getLists() {
        return lists;
    }

    // Doc file -> FileInputStream 
    // Ghi file -> FileOutputStream
    public String docFile(String path) {
        try {
            // B1: kiem tra su ton tai cua file 
            File file = new File(path);
            if (!file.exists()) {
                return "File k ton tai";
            }
            // Doc file
            // B2: Mo file 
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            // B3: Doc file toi khi k doc nua 
            while (fis.available() > 0) { // Con dong thi dong
                lists.add((SinhVien) ois.readObject());
            }
            // B4: Close 
            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }

    public String ghiFile(String path) {
        try {
            // B1: kiem tra su ton tai cua file 
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            // Ghi file
            // B2: Mo file 
            FileOutputStream fis = new FileOutputStream(file);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            for (SinhVien sv : lists) {
                ois.writeObject(sv); // Ghi file
            }
            // B4: Close 
            ois.close();
            fis.close();
            return "Ghi file thanh cong";
        } catch (Exception e) {
            return "Ghi file that bai";
        }
    }
}
