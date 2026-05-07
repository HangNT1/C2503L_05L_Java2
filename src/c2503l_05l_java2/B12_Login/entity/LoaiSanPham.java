/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B12_Login.entity;

/**
 *
 * @author hangnt
 */
public class LoaiSanPham {

    private int ma;
    private String ten;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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

    @Override
    public String toString() {
        return "LoaiSanPham{" + "ma=" + ma + ", ten=" + ten + '}';
    }

}
