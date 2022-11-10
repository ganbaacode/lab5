package com.example.lab1.service;

import com.example.lab1.entity.dto.request.LoginRequest;
import com.example.lab1.entity.dto.response.LoginResponse;
import org.springframework.stereotype.Service;

//@Service
public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
}
