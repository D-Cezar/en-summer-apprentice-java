package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "ticket_category")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ticket_category_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName="event_id")
    private Event event;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    public TicketCategory(long id, Event event,
                          String description, double price) {
        this.id = id;
        this.event = event;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TicketCategory() {
    }
}
