package com.kta.explorecrete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String welcome(ModelMap modelMap) {
        return "index";
    }
}
