package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.TourPackage;
import com.kta.explorecrete.service.TourPackageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    TourPackageService tourPackageService;

    public IndexController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @GetMapping("/")
    public String welcome(Model model) {
        List<TourPackage> tourPackages = tourPackageService.findAll();
        model.addAttribute("tourPackages", tourPackages);
        return "index";
    }


    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
