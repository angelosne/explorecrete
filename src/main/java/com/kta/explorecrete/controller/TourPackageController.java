package com.kta.explorecrete.controller;

import com.kta.explorecrete.service.TourPackageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TourPackageController {

    private final TourPackageService tourPackageService;

    public TourPackageController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @GetMapping("api/tourPackage")
    public ResponseEntity getAllTourPackage() {
        return new ResponseEntity(tourPackageService.findAll(), HttpStatus.OK);
    }

}
