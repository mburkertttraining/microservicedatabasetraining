package ch.erni.microservicebase.Persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.erni.microservicebase.Persistence.DAO.Person;

/**
 * Created by Matthias on 13/09/2017.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	//TODO 02 Implement a Query method which finds a person by its lastname please use the easy jpa way for this if you dont know ask the instructor
}
