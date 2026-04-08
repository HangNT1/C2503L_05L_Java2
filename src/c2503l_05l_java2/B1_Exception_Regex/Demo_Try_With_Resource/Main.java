/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B1_Exception_Regex.Demo_Try_With_Resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hangnt
 */
public class Main {

    // liet ke cac buoc: 
    // B1: tao file moi 
    // B2: viet vao file 
    // B3: luu 
    // B4: dong file => du thanh cong hay that bai deu dong 
    // tu dong dong => try ()
    public static void main(String[] args) {
//        try {
//            
//        } catch (Exception e) {
//        }finally{
//            // dong file 
//        }
//         try(can phai dong ) {
//            
//        } catch (Exception e) {
//        }
// https://github.com/ndru83/desugaring-java/blob/master/try-with-resource-internals.adoc
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>" + line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }
}
