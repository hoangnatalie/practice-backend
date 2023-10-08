package com.example.todo.account.service;

import com.example.todo.account.dto.request.SignUpRequest;
import com.example.todo.account.dto.request.SigninRequest;
import com.example.todo.account.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}