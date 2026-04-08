/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B1_Exception_Regex.Demo_Regex;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap email:");
        String email = sc.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        // match 
        if(email.matches(regex)){
            System.out.println("Email hop le");
        }else{
            System.out.println("Email k hop le ");
        }
    }
}
