package com.example.orderapi.controller;

import com.example.orderapi.config.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String username) {
        String token = jwtUtil.generateToken(username);
        return Map.of("token", token);
    }
}
