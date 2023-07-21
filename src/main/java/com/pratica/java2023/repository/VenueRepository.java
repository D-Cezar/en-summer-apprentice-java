package com.pratica.java2023.repository;

import com.pratica.java2023.entities.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends CrudRepository<Venue,Long> {
}
