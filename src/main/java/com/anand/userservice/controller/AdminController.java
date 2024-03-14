package com.anand.userservice.controller;

import com.anand.userservice.entity.User;
import com.anand.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/admin")
public class AdminController {
    private final UserService userService;
    @GetMapping("/hello")
    public ResponseEntity<User> getUserById(){
        System.out.println("hii");
        return ResponseEntity.ok(userService.getUserById(1));
    }
}
