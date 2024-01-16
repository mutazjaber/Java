package com.mutaz.savetravel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mutaz.savetravel.models.SaveTravels;

public interface TravelRepository extends CrudRepository<SaveTravels, Long> {
	List<SaveTravels> findAll();

}
