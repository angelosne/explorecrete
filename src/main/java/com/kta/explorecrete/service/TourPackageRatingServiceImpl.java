package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.TourPackageRating;
import com.kta.explorecrete.repository.TourPackageRatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageRatingServiceImpl implements TourPackageRatingService {
    private final TourPackageRatingRepository tourPackageRatingRepository;

    public TourPackageRatingServiceImpl(TourPackageRatingRepository tourPackageRatingRepository) {
        this.tourPackageRatingRepository = tourPackageRatingRepository;
    }


    @Override
    public List<TourPackageRating> findAll() {
        return tourPackageRatingRepository.findAll();
    }

    @Override
    public List<TourPackageRating> findAllByTourPackageId(int id) {
        return tourPackageRatingRepository.findAllByTourPackageId(id);
    }

    @Override
    public List<TourPackageRating> findAllByPersonId(int id) {
        return tourPackageRatingRepository.findAllByPersonId(id);
    }
}
