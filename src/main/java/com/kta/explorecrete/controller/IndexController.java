package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.Person;
import com.kta.explorecrete.entity.TourPackage;
import com.kta.explorecrete.entity.TourPackageRating;
import com.kta.explorecrete.service.PersonService;
import com.kta.explorecrete.service.TourPackageRatingService;
import com.kta.explorecrete.service.TourPackageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    TourPackageService tourPackageService;
    TourPackageRatingService tourPackageRatingService;
    PersonService personService;

    public IndexController(TourPackageService tourPackageService, TourPackageRatingService tourPackageRatingService, PersonService personService) {
        this.tourPackageService = tourPackageService;
        this.tourPackageRatingService = tourPackageRatingService;
        this.personService = personService;
    }

    @GetMapping("/")
    public String welcome(Model model) {
        List<TourPackage> tourPackages = tourPackageService.findAll();
        model.addAttribute("tourPackages", tourPackages);
        TourPackageRating newRating = new TourPackageRating();
        model.addAttribute("newRating", newRating);
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
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
