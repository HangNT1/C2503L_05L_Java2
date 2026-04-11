/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package c2503l_05l_java2.B3_Generic.service;

import java.util.List;

/**
 *
 * @author hangnt
 */
public interface IService<T> {
    
    void nhapThongTin(List<T> lists);
    
    void inThongTin(List<T>lists);
    
}
