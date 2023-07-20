package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "ticket_category")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ticket_category")
    private long ticket_category;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName="event_id", foreignKey=@ForeignKey(name = "FK__ticket_ca__event__412EB0B6"))
    private EventEntity event;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;


}
