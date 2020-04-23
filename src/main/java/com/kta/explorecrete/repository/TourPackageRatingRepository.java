package com.kta.explorecrete.repository;

import com.kta.explorecrete.entity.TourPackageRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourPackageRatingRepository extends JpaRepository<TourPackageRating, Integer> {
    List<TourPackageRating> findAllByTourPackageId(int id);
}
