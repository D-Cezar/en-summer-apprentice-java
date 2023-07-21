package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "event_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "venue_id", referencedColumnName="venue_id")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "event_type_id", referencedColumnName="event_type_id")
    private EventType eventType;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private  Date endDate;

    public Event() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Event(long id, Venue venue,
                 EventType eventType, String description,
                 String name, Date startDate, Date endDate) {
        this.id = id;
        this.venue = venue;
        this.eventType = eventType;
        this.description = description;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
