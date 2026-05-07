/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B12_Login.entity;

/**
 *
 * @author hangnt
 */
public class SanPham {

    private int ma;
    private String ten;
    private double gia;
    private int soLuong;
    private LoaiSanPham idLoai;

    public SanPham() {
    }

    public SanPham(int ma, String ten, double gia, int soLuong, LoaiSanPham idLoai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.idLoai = idLoai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public LoaiSanPham getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(LoaiSanPham idLoai) {
        this.idLoai = idLoai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", soLuong=" + soLuong + ", idLoai=" + idLoai + '}';
    }

}
