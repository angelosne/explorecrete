package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.TourPackage;

import java.util.List;
import java.util.Optional;

public interface TourPackageService {
    List<TourPackage> findAll();

    Optional<TourPackage> findTourPackageById(int id);

}
