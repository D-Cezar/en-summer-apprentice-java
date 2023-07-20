package com.pratica.java2023.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "event")
public class EventEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "event_id")
    private long event_id;

    @ManyToOne
    @JoinColumn(name = "venue_id", referencedColumnName="venue_id", foreignKey=@ForeignKey(name = "FK__event__venue_id__3E52440B"))
    private VenueEntity venue;

    @ManyToOne
    @JoinColumn(name = "event_type_id", referencedColumnName="event_type_id", foreignKey=@ForeignKey(name = "FK__event__event_typ__3D5E1FD2"))
    private EventType eventType;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private  Date end_date;


}
