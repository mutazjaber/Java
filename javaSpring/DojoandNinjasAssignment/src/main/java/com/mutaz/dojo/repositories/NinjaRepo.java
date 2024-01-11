package com.mutaz.dojo.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.mutaz.dojo.models.Ninja;

			public interface NinjaRepo extends CrudRepository<Ninja, Long>{
				 // this method retrieves all the books from the database
				 List<Ninja> findAll();


			}
	



