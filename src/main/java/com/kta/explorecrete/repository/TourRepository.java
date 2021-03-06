package com.kta.explorecrete.repository;

import com.kta.explorecrete.entity.Tour;
import com.kta.explorecrete.entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {
    List<Tour> findAllByTourPackageId(int id);
}
