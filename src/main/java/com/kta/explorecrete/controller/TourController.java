package com.kta.explorecrete.controller;

import com.kta.explorecrete.service.TourService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TourController {

    private TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;


    }

}
