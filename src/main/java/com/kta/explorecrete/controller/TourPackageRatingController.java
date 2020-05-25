package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.TourPackageRating;
import com.kta.explorecrete.service.TourPackageRatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TourPackageRatingController {

    private final TourPackageRatingService tourPackageRatingService;

    public TourPackageRatingController(TourPackageRatingService tourPackageRatingService) {
        this.tourPackageRatingService = tourPackageRatingService;
    }

    @GetMapping("api/ratings")
    public ResponseEntity getAllTourPackageRating() {
        return new ResponseEntity(tourPackageRatingService.findAll(), HttpStatus.OK);
    }

    @GetMapping("api/ratings/{tourPackageId}")
    public ResponseEntity getTourById(@PathVariable("tourPackageId") int id) {
        return new ResponseEntity(tourPackageRatingService.findAllByTourPackageId(id), HttpStatus.OK);
    }

    @GetMapping("/tourPackageRating")
    public String getTourList(Model model){
        List<TourPackageRating> tourPackageRatings = tourPackageRatingService.findAll();
        model.addAttribute("tourPackageRatings",tourPackageRatings);
        return "tourPackageRatings";
    }

    @GetMapping("/tourPackageRating/{tourPackageId}")
    public String getTourById(@PathVariable("tourPackageId") int tourPackageId,Model model){
        List<TourPackageRating> tourPackageRatings = tourPackageRatingService.findAllByTourPackageId(tourPackageId);
        model.addAttribute("tourPackageRatings", tourPackageRatings);
        return "tourPackageRatings";
    }

    @GetMapping("/tourPackageRatingByPerson/{personId}")
    public String getTourByPersonId(@PathVariable("personId") int personId, Model model) {
        List<TourPackageRating> tourPackageRatings = tourPackageRatingService.findAllByPersonId(personId);
        model.addAttribute("tourPackageRatings", tourPackageRatings);
        return "tourPackageRatings";
    }

    @PostMapping("/")
    public String saveNewRating(@ModelAttribute("newRating") TourPackageRating rating, BindingResult result, Model model) {
        System.out.println("Saving the new rating from user " + rating.getPerson().getName());
        System.out.println("for package " + rating.getTourPackage().getName());
        System.out.println("with score " + rating.getScore());
        System.out.println("who commented it " + rating.getComments());
        tourPackageRatingService.saveTourPackageRating(rating);
        return "redirect:/";
    }
}