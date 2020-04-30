package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.Person;
import com.kta.explorecrete.entity.Tour;
import com.kta.explorecrete.service.TourService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class TourController {

    private TourService tourService;

    public TourController(TourService tourService) {
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

    @GetMapping("/tour")
    public String getTourList(Model model){
        List<Tour> tours = tourService.findAll();
        model.addAttribute("tours",tours);
        return "fragments/tours";
    }

}
