/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B9_JDBC_P2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author hangnt
 */
@AllArgsConstructor // contructor full tham so 
@NoArgsConstructor // contructor k ths 
@Getter
@Setter
@ToString 
@Builder // custom contructor tuy y tham so
public class DienThoai {

    // Tao entity cua doi tuong k co khoa ngoai truoc 
    // Tao entity co khoa ngoai: 
    // Liet ke cac thuoc tinh k phai la khoa ngoai truoc 
    private int ma;

    private String ten;

    private String mauSac;

    private double gia;

    private int soLuong;

    // Khoa ngoai 
    // thong thuong day tu bai truoc 
//    private int maHang;
    // KHAI BAO 1 DOI TUONG KHOA NGOAI 
    private Hang hang;
//
//    public DienThoai() {
//    }
//
//    public DienThoai(int ma, String ten, String mauSac, double gia, int soLuong, Hang hang) {
//        this.ma = ma;
//        this.ten = ten;
//        this.mauSac = mauSac;
//        this.gia = gia;
//        this.soLuong = soLuong;
//        this.hang = hang;
//    }
//
//    public int getMa() {
//        return ma;
//    }
//
//    public void setMa(int ma) {
//        this.ma = ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public String getMauSac() {
//        return mauSac;
//    }
//
//    public void setMauSac(String mauSac) {
//        this.mauSac = mauSac;
//    }
//
//    public double getGia() {
//        return gia;
//    }
//
//    public void setGia(double gia) {
//        this.gia = gia;
//    }
//
//    public int getSoLuong() {
//        return soLuong;
//    }
//
//    public void setSoLuong(int soLuong) {
//        this.soLuong = soLuong;
//    }
//
//    public Hang getHang() {
//        return hang;
//    }
//
//    public void setHang(Hang hang) {
//        this.hang = hang;
//    }
//
//    @Override
//    public String toString() {
//        return "DienThoai{" + "ma=" + ma + ", ten=" + ten + ", mauSac=" + mauSac + ", gia=" + gia + ", soLuong=" + soLuong + ", hang=" + hang + '}';
//    }

}
