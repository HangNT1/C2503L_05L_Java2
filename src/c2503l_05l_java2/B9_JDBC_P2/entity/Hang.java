/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B9_JDBC_P2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author hangnt
 */
@AllArgsConstructor // contructor full tham so 
@NoArgsConstructor // contructor k ths 
@Getter
@Setter
@ToString 
@Builder // custom contructor tuy y tham so
public class Hang {

    private int ma;

    private String ten;

}
