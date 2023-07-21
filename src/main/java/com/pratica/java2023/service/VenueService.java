package com.pratica.java2023.service;

import com.pratica.java2023.entities.Venue;
import com.pratica.java2023.repository.VenueRepository;
import com.pratica.java2023.service.interfaces.VenueServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService implements VenueServiceInterface {
    @Autowired
    VenueRepository venueRepository;

    @Override
    public void saveVenue(Venue venue){
        venueRepository.save(venue);
    }

    @Override
    public void deleteVenue(Venue venue){
        venueRepository.delete(venue);
    }

    @Override
    public void deleteVenueById(long id){
        venueRepository.deleteById(id);
    }

    @Override
    public Optional<Venue> findVenue(long id){
        return venueRepository.findById(id);
    }

    @Override
    public List<Venue> findAllVenues() {
        return (List<Venue>) venueRepository.findAll();
    }
}
