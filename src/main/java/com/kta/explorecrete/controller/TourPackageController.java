package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.TourPackage;
import com.kta.explorecrete.service.TourPackageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TourPackageController {

    private final TourPackageService tourPackageService;

    public TourPackageController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @GetMapping("api/tourPackages")
    public ResponseEntity getAllTourPackage() {
        return new ResponseEntity(tourPackageService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/tourPackage")
    public String getPersonList(Model model){
        List<TourPackage> tourPackages = tourPackageService.findAll();
        model.addAttribute("tourPackages",tourPackages);
        return "tourPackages";
    }

}
