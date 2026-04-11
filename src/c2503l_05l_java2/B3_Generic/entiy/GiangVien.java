/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B3_Generic.entiy;

/**
 *
 * @author hangnt
 */
public class GiangVien {

    private String maGiangVien;

    private String ten;

    private int tuoi;

    private boolean gioiTinh;

    private String chuyenNganh;

    private int soGioDay;

    public GiangVien() {
    }

    public GiangVien(String maGiangVien, String ten, int tuoi, boolean gioiTinh, String chuyenNganh, int soGioDay) {
        this.maGiangVien = maGiangVien;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.chuyenNganh = chuyenNganh;
        this.soGioDay = soGioDay;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
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

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGiangVien=" + maGiangVien + ", ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", chuyenNganh=" + chuyenNganh + ", soGioDay=" + soGioDay + '}';
    }

    public void inThongTin() {
        System.out.println(toString());
    }
}
