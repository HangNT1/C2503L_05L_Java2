/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B1_Exception_Regex.Demo_Exception_Basic;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(a / 0);
        // Su dung try...catch 
        try {
            // chua dong ma nghi ngo co loi 
            int a = 10;
            System.out.println(a / 8);
        } catch (ArithmeticException e) {
            // xu ly loi: co the co nhieu catch  
            System.out.println("Không được phép chia cho 0");
        } finally {
            // du chuong trinh loi hay k thi luon luon vao finally 
            System.out.println("Finally");
        }

        // Nhap 1 mang so nguyen gom 5 tu phan.
        // Truy van phan tu o vi tri so 7 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter numbers: ");
//        int arr[] = new int[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        System.out.print("Elements of array: ");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);
//
//        }
//        try {
//            System.out.println(arr[7]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//
//        }
    }
}
