/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B1_Exception_Regex.Demo_Custom_Exception;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        MyService a = new MyService();
        try {
            a.checkAge(15);
        } catch (MyException ex) {
            System.out.println(ex.getMessage() + " - " + ex.getCode());
        }
    }
}
