package com.mutaz.savetravel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mutaz.savetravel.models.SaveTravels;
import com.mutaz.savetravel.repositories.TravelRepository;
@Service
public class TravelService {
	 private final TravelRepository travelRepository;
	    
	    public TravelService(TravelRepository travelRepository) {
	        this.travelRepository = travelRepository;
	    }
	    // returns all the Travels
	    public List<SaveTravels> allTravels() {
	        return travelRepository.findAll();
	    }
	    // creates a Travel
	    public SaveTravels createTravel(SaveTravels travels) {
	        return travelRepository.save(travels);
	    }
	    // retrieves a Travel
	    public SaveTravels findTravel(Long id) {
	        Optional<SaveTravels> optionalTravel = travelRepository.findById(id);
	        if(optionalTravel.isPresent()) {
	            return optionalTravel.get();
	        } else {
	            return null;
	        }
	    }
	    public SaveTravels updateTravel(SaveTravels travel) {
	        return travelRepository.save(travel);
	      }

	    public void deleteTravel(Long id) {
	    	travelRepository.deleteById(id);
	    }
	    
}
