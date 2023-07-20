package com.pratica.java2023.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "venue")
public class VenueEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "venue_id")
    private long venue_id;

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private  String type;

    @Column(name = "capacity")
    private int capasicty;


}
