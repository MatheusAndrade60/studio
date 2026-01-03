package com.bodyesthetic.studio.controller.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Login {
    @Controller
    public class LoginController {
        @GetMapping("/login")
        public String loginController() {
            return "login";
        }
    }
}
