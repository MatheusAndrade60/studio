package com.bodyesthetic.studio.controller.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Results {
    @Controller
    public class ResultsController {
        @GetMapping("/results")
        public String resultsController() {
            return "results";
        }
    }
}
