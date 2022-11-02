/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Nando.User.service.service;

import com.Nando.User.service.dto.User;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface UserService {

    public static User getUser(String id);

    public static void addUser(User user);

    public static List<User> getAllUsers();

    public static class getAllUsers {

        public getAllUsers() {
        }
    }
    
}
