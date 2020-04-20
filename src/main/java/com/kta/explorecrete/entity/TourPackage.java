package com.kta.explorecrete.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TourPackage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 140)
    private String name;
    @OneToMany(mappedBy = "tourPackage")
    private Set<TourPackageRating> ratings;

    public TourPackage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TourPackageRating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<TourPackageRating> ratings) {
        this.ratings = ratings;
    }
}
