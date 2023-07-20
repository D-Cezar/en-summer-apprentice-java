package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "event_type")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "event_type_id")
    private long event_type_id;

    @Column(name = "event_type_name")
    private String event_type_name;


}
