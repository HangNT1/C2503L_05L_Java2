/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B6_JDBC.entity;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    private int ma;

    private String ten;

    private int tuoi;

    private boolean gioiTinh;

    private String nganhHoc;

    private double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, int tuoi, boolean gioiTinh, String nganhHoc, double diemTrungBinh) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.nganhHoc = nganhHoc;
        this.diemTrungBinh = diemTrungBinh;
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

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", nganhHoc=" + nganhHoc + ", diemTrungBinh=" + diemTrungBinh + '}';
    }

}
