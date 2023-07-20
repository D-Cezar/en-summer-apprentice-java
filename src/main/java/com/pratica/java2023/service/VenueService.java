package com.pratica.java2023.service;

import com.pratica.java2023.entities.VenueEntity;
import com.pratica.java2023.repository.VenueRepository;
import com.pratica.java2023.service.interfaces.VenueServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class VenueService implements VenueServiceInterface {
    @Autowired
    VenueRepository venueRepository;

    @Override
    public void saveVenue(VenueEntity venue){
        venueRepository.save(venue);
    }

    @Override
    public void deleteVenue(VenueEntity venue){
        venueRepository.delete(venue);
    }

    @Override
    public void deleteVenueById(long id){
        venueRepository.deleteById(id);
    }

    @Override
    public Optional<VenueEntity> findVenue(long id){
        return venueRepository.findById(id);
    }
}
