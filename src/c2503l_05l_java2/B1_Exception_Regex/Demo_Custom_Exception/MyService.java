/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B1_Exception_Regex.Demo_Custom_Exception;

/**
 *
 * @author hangnt
 */
public class MyService {

    public void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("C01", "Tuoi k hop le");
        }
        System.out.println("Tuoi hop le");
    }
}
