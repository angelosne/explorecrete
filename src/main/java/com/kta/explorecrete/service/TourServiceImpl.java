package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.Tour;
import com.kta.explorecrete.entity.TourPackage;
import com.kta.explorecrete.repository.PersonRepository;
import com.kta.explorecrete.repository.TourRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourServiceImpl implements TourService {

    private final TourRepository tourRepository;

    public TourServiceImpl(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @Override
    public List<Tour> findAll() {
        return tourRepository.findAll();
    }

    @Override
    public List<Tour> findAllByTourPackageId(int id) {
        return tourRepository.findAllByTourPackageId(id);
    }

    @Override
    public Optional<Tour> findById(int id) {
        Optional<Tour> tour = tourRepository.findById(id);
        return tour;
    }
}
