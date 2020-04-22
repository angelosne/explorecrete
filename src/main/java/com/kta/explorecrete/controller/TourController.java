package com.kta.explorecrete.controller;

import com.kta.explorecrete.service.TourServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TourController {

    private TourServiceImpl tourService;

    public TourController(TourServiceImpl tourService) {
        this.tourService = tourService;
    }

    @GetMapping("api/tours")
    public ResponseEntity getAllTour() {
        return new ResponseEntity(tourService.findAll(), HttpStatus.OK);
    }

    @GetMapping("api/tours/{tourPackageId}")
    public ResponseEntity getTourById(@PathVariable("tourPackageId") int id){
        return new ResponseEntity(tourService.findAllByTourPackageId(id), HttpStatus.OK);
    }

}
