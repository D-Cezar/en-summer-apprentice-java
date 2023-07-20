package com.pratica.java2023.repository;

import com.pratica.java2023.entities.VenueEntity;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<VenueEntity,Long> {
}
