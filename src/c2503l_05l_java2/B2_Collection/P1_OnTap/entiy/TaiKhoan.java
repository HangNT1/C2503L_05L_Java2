/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P1_OnTap.entiy;

/**
 *
 * @author hangnt
 */
public class TaiKhoan {

    private String name;
    private String email;
    private String password;

    public TaiKhoan() {
    }

    public TaiKhoan(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }

}
