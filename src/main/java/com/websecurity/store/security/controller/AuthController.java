package com.websecurity.store.security.controller;

import com.websecurity.store.security.AuthService;
import com.websecurity.store.security.dto.LoginRequest;
import com.websecurity.store.security.dto.SignUpRequest;
import com.websecurity.store.security.dto.SignUpRequestNoLogin;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService service;

    @PostMapping("/token")
    public ResponseEntity<?> authenticate(@Valid @RequestBody LoginRequest request) {
        return ResponseEntity.ok(service.authenticateRequest(request));
    }

    @PostMapping("/user")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> createUser(@Valid @RequestBody SignUpRequest request) {
        return ResponseEntity.ok(service.signUpUser(request));
    }

    @PostMapping("/signupnew")
    public ResponseEntity<?> createUserNoLogin(@Valid @RequestBody SignUpRequestNoLogin request) {
        return ResponseEntity.ok(service.signUpUserNoLogin(request));
    }

}