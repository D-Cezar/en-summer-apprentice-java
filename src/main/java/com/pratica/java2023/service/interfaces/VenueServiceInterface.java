package com.pratica.java2023.service.interfaces;

import com.pratica.java2023.entities.Venue;

import java.util.List;
import java.util.Optional;

public interface VenueServiceInterface {
    void saveVenue(Venue venue);

    void deleteVenue(Venue venue);

    void deleteVenueById(long id);

    Optional<Venue> findVenue(long id);

    List<Venue> findAllVenues();
}
