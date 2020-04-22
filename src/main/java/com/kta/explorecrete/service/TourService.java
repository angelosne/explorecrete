package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.Tour;
import com.kta.explorecrete.entity.TourPackage;
import com.kta.explorecrete.repository.TourRepository;

import java.util.List;

public interface TourService {

    List<Tour> findAll();
    List<Tour> findAllByTourPackageId(int id);
}
