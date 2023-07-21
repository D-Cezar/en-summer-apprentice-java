package com.pratica.java2023.repository;

import com.pratica.java2023.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event,Long> {
    List<Event> findAllByVenue_IdAndEventTypeName(long venueId, String eventType);
}
