/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B2_Collection.P2_Demo;

import java.util.HashMap;

/**
 *
 * @author hangnt
 */
public class DemoMap {

    public static void main(String[] args) {
        // Map: 1 cap: key-value 
        // 404 - Notfound
        HashMap<Integer, String> map = new HashMap<>();
        // key la duy nhat 
        // them phan tu vao map: put 
        map.put(404, "Not found");
        map.put(500, "Logic");
        map.put(403, "Cam quyen");
        map.put(400, "Bad request");
        // in 
        System.out.println(map);
        map.forEach(
                (k, v) -> System.out.println(k + " - " + v)
        );
    }
}
