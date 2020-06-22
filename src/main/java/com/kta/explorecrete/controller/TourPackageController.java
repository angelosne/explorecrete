package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.Tour;
import com.kta.explorecrete.entity.TourPackage;
import com.kta.explorecrete.service.TourPackageService;
import com.kta.explorecrete.service.TourService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class TourPackageController {

    private final TourPackageService tourPackageService;
    private final TourService tourService;


    public TourPackageController(TourPackageService tourPackageService, TourService tourService) {
        this.tourPackageService = tourPackageService;
        this.tourService = tourService;
    }

    @GetMapping("api/tourPackages")
    public ResponseEntity getAllTourPackage() {
        return new ResponseEntity(tourPackageService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/tourPackages")
    public String getPersonList(Model model){
        List<TourPackage> tourPackages = tourPackageService.findAll();
        model.addAttribute("tourPackages",tourPackages);
        return "tourPackages";
    }

    @GetMapping("/tourPackages/{tourPackageId}")
    public String getTourById(@PathVariable int tourPackageId, Model model) {
        List<Tour> tours = tourService.findAllByTourPackageId(tourPackageId);
        model.addAttribute("tours", tours);
        Optional<TourPackage> tourPackage = tourPackageService.findTourPackageById(tourPackageId);
        model.addAttribute("tourPackage", tourPackage);
        return "tours";
    }

}
