/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P3_ChuaBaiMau.entity;

/**
 *
 * @author hangnt
 */
public class NhanVien {
//    Tạo 1 đối tượng NhanVien gồm các thuộc tính: maNhanVien - String, ten - String , 
    // bac - int, tuoi - int, gioiTinh - boolean và các contructor, getter, setter 
    // và ham inThongTin(): void 

    private String maNhanVien;
    private String ten;
    private int bac;
    private int tuoi;
    private boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String ten, int bac, int tuoi, boolean gioiTinh) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.bac = bac;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void inThongTin() {
        System.out.println("Ma nhan vien: " + maNhanVien
                + "\nTen nhan vien: " + ten
                + "\nBac: " + bac
                + "\nTuoi: " + tuoi
                + "\nGioi tinh: " + gioiTinh);
    }
}
