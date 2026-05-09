/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_java2.B12_Login.service;

import c2503l_05l_java2.B12_Login.entity.User;
import c2503l_05l_java2.B12_Login.repository.UserRepository;

/**
 *
 * @author hangnt
 */
public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public User login(String username, String password) {
        return userRepository.login(username, password);
    }
}
