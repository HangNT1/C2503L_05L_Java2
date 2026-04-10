/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P1_OnTap.service;

import c2503l_05l_java2.B2_Collection.P1_OnTap.entiy.TaiKhoan;
import c2503l_05l_java2.B2_Collection.P1_OnTap.exception.InvalidEmailException;
import c2503l_05l_java2.B2_Collection.P1_OnTap.exception.InvalidPasswordException;
import c2503l_05l_java2.B2_Collection.P1_OnTap.exception.InvalidUsernameException;

/**
 *
 * @author hangnt
 */
public class TaiKhoanService {

    private final String REGEX_USERNAME = "^[A-Za-z0-9]{5,15}$";
    private final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d).{8,}$";
    private final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public void checkThongTinTaiKhoan(TaiKhoan tk) throws InvalidUsernameException,
            InvalidEmailException, InvalidPasswordException {
        if (!tk.getName().matches(REGEX_USERNAME)) {
            throw new InvalidUsernameException("U01", "User name k hop le");
        }
        if (!tk.getEmail().matches(REGEX_EMAIL)) {
            throw new InvalidEmailException("E01", "Email k hop le");
        }
        if (!tk.getPassword().matches(REGEX_PASSWORD)) {
            throw new InvalidPasswordException("P01", "Password k hop le");
        }
    }
}
