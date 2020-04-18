package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.TourPackageRating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TourPackageRatingService {
List<TourPackageRating> findAll();

}
