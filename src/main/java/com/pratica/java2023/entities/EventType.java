package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "event_type")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "event_type_id")
    private long eventTypeId;

    @Column(name = "event_type_name")
    private String name;

    public EventType() {
    }

    public long getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(long eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventType(long eventTypeId, String eventTypeName) {
        this.eventTypeId = eventTypeId;
        this.name = eventTypeName;
    }
}
