/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B1_Exception_Regex.Demo_Throw_Throws;

/**
 *
 * @author hangnt
 */
public class Main {

    static void test() throws Exception,ArrayIndexOutOfBoundsException {
        int age = 10;
        if (age < 18) {
            // nesm loi => throw 
            // checked => throws: co the chua nhieu loai loi, 
            // throw => validate, check su ton tai => service 
            throw new Exception("aaaa");
        }
    }
    // 20:00 
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception ex) {
            System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
