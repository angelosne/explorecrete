package com.kta.explorecrete.controller;

import com.kta.explorecrete.service.TourPackageRatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TourPackageRatingController {

    private final TourPackageRatingService tourPackageRatingService;

    public TourPackageRatingController(TourPackageRatingService tourPackageRatingService) {
        this.tourPackageRatingService = tourPackageRatingService;
    }

    public ResponseEntity getAllTourPackageRating() {
        return new ResponseEntity(tourPackageRatingService.findAll(), HttpStatus.OK);
    }

}