/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Nando.User.service.Controller;
import com.Nando.User.service.service.UserService;
import com.Nando.User.service.dto.User;
import java.net.URI;
import java.net.URL;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ACER
 */
public class UserController {
    private UserService userService;
    
    @GetMapping("/user")
    public List<User> getAllUsers(){
     return UserService.getAllUsers(); 
  }

    @GetMapping("/User/(id)")
      public User getUser(@PathVariable String id){
         return UserService.getUser(id);
      }
      
      @PostMapping
      public ResponseEntity<Object> addUser(User user){
        UserService.addUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/(Id)")
                .buildAndExpand(User.getId())
                .toUri();
        return ResponseEntity.created(path).build();
          
      }
      
      @PutMapping("/user")
      public  User updatUser(User user){
              return userService.updateUser(User);
      }

      @DeleteMapping("/user/(id)"){
      public user DeletUser(User user)
              return userService.DeletUser (user);
              }
        }
        