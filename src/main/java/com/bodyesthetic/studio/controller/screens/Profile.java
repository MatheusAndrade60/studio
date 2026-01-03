package com.bodyesthetic.studio.controller.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Profile {
    @Controller
    public class ProfileController {
        @GetMapping("/profile")
        public String profileController() {
            return "profile";  // Nome sem .html
        }
    }
}
