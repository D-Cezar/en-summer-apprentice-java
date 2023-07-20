package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.EventEntity;

import java.util.Optional;

public interface EventServiceInterface {
    void saveEvent(EventEntity event);

    void deleteEvent(EventEntity event);

    void deleteEventById(long id);

    Optional<EventEntity> findEvent(long id);
}
