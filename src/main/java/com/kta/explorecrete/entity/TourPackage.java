package com.kta.explorecrete.entity;

import javax.persistence.*;

@Entity
public class TourPackage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 140)
    private String name;

    @ManyToOne
    private Tour tour;

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
}
