package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "venue")
public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "venue_id")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapasicty() {
        return capasicty;
    }

    public void setCapasicty(int capasicty) {
        this.capasicty = capasicty;
    }

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private  String type;

    @Column(name = "capacity")
    private int capasicty;

    public Venue(long venueId, String location, String type, int capasicty) {
        this.id = venueId;
        this.location = location;
        this.type = type;
        this.capasicty = capasicty;
    }

    public Venue() {
    }
}
