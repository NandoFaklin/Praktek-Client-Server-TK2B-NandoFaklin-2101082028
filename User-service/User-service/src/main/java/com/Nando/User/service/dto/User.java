/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Nando.User.service.dto;

import com.Nando.User.service.service.UserService;
import java.net.URL;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
/**
 *
 * @author ACER
 */
public class User {
    private String Id;
     private String name;
      private String address ;
      
      public String getId(){
          return Id;    
      }
      public String getId(){
          this Id = id;    
      }
        public String getName(){
          return name;    
      }
          public String getAddress(){
          return address;    
      }

    

    
}
