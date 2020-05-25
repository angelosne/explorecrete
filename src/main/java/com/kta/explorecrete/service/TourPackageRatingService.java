package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.TourPackageRating;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TourPackageRatingService {
    List<TourPackageRating> findAll();

    List<TourPackageRating> findAllByTourPackageId(int id);

    List<TourPackageRating> findAllByPersonId(int id);

    Void saveTourPackageRating(TourPackageRating tourPackageRating);

}
