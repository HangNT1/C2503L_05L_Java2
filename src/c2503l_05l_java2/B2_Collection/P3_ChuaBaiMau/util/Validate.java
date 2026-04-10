/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P3_ChuaBaiMau.util;

/**
 *
 * @author hangnt
 */
public class Validate {

    private static final String REGEX_USERNAME = "^[A-Za-z0-9]{5,15}$";
    private static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d).{8,}$";
    private static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean checkEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }
}
