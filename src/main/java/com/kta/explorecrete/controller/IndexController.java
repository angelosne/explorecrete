package com.kta.explorecrete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("welcomeMessage", "Καλώς ορίσατε στο KTA Tours™");
        model.addAttribute("chooseDestination", "Επιλέξτε κάποιον από τους προορισμούς μας:");
        return "index";
    }
}
