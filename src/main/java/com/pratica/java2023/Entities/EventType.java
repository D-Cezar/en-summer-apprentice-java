package com.pratica.java2023.Entities;

import jakarta.persistence.*;


@Entity
@Table(name = "event_type")
public class EventType {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "event_type_id")
    private long event_type_id;

    @Column(name = "event_type_name")
    private String event_type_name;


}
