package com.polyglot.appsecurity.controller;

import com.polyglot.appsecurity.jwt.JwtToken;
import com.polyglot.appsecurity.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;
    @Autowired
    private JwtToken jwtTokenCross;
    Logger logger = LoggerFactory.getLogger(AuthController.class);

}
