package com.example.lab1.controller;


import com.example.lab1.entity.dto.request.LoginRequest;
import com.example.lab1.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/authenticate")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AuthController {


    @Autowired
    private AuthService authService;


    public AuthController(AuthService authService){this.authService=authService;}

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        var loginResponse = authService.login(loginRequest);
        return ResponseEntity.ok().body(loginResponse);
    }


}
