package com.mutaz.dojo.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mutaz.dojo.models.Dojo;
@Repository

		public interface DojoRepo extends CrudRepository<Dojo, Long>{
			 // this method retrieves all the books from the database
			 List<Dojo> findAll();
		}