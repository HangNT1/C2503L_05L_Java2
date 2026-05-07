/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B12_Swing_P2.service;

import c2503l_05l_java2.B12_Swing_P2.entity.Sach;
import c2503l_05l_java2.B12_Swing_P2.repository.SachRepository;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SachService {

    private SachRepository sachRepository = new SachRepository();

    public List<Sach> getAll() {
        return sachRepository.getAll();
    }

    public Sach getOne(int ma) {
        return sachRepository.getOne(ma);
    }
}
