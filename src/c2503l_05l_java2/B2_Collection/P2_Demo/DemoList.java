/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P2_Demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DemoList {

    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        // Class = new Class 
        // C2: interface = new Class 
        List<String> lists1 = new ArrayList<>();
        // Cac phan tu trong list: 
        // insert thanh nao truoc => o vi tri 1, chua duoc cac phan tu trung lap  
        lists1.add("aa");
        lists1.add("aa1");
        lists1.add("aa2");
        lists1.add("aa3");
        lists1.add("aa4");
        // in 
        lists1.forEach(s -> System.out.println(s));
        lists.forEach(System.out::println);
    }
}
