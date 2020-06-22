package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.TourPackage;
import com.kta.explorecrete.repository.TourPackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourPackageServiceImpl implements TourPackageService {
    private final TourPackageRepository tourPackageRepository;

    public TourPackageServiceImpl(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    @Override
    public List<TourPackage> findAll() {
        return tourPackageRepository.findAll();
    }

    @Override
    public Optional<TourPackage> findTourPackageById(int id) {
        return tourPackageRepository.findById(id);
    }
}
