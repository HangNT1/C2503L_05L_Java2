/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B5_Thread;

/**
 *
 * @author hangnt
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            count++;
            try {
                Thread.sleep(1000);// mil..: 1s = 1000mil
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(count);
        }

    }
    // su dung extends: ke thua Thread
    // dem gio chuong trinh chay 
    // 0 => 00: 00 :00  
    // 1 => 00: 00 :01  
    // 3
    //.. 
    // 70  -> 00:01:10 
}
