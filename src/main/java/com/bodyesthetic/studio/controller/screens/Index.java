package com.bodyesthetic.studio.controller.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Index {
    @Controller
    public class IndexController {
        @GetMapping("/index")
        public String indexController() {
            return "index";
        }
    }
}
