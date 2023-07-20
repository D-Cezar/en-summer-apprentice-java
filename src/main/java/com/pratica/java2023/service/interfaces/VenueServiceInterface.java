package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.VenueEntity;

import java.util.Optional;

public interface VenueServiceInterface {
    void saveVenue(VenueEntity venue);

    void deleteVenue(VenueEntity venue);

    void deleteVenueById(long id);

    Optional<VenueEntity> findVenue(long id);
}
