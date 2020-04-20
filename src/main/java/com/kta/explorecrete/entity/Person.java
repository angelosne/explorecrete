package com.kta.explorecrete.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30)
    private String name;
    @Column(length = 30)
    private String surname;
    @Column(length = 30)
    private String email;
    @OneToMany(mappedBy = "person")
    private Set<TourPackageRating> ratings;

    public Person() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<TourPackageRating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<TourPackageRating> ratings) {
        this.ratings = ratings;
    }
}
