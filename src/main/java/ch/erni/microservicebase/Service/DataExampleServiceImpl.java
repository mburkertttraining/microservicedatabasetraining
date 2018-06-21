package ch.erni.microservicebase.Service;

import ch.erni.microservicebase.Persistence.DAO.Person;
import ch.erni.microservicebase.Persistence.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * Created by Matthias on 14/09/2017.
 */
@Service
@Transactional
public class DataExampleServiceImpl implements DataExampleService {

    private PersonRepository repository;

    @Autowired
    public DataExampleServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void savePerson(Person person) {
        repository.save(person);
    }

    @Override
    public Person findPerson(long id) {
        return repository.findOne(id);
    }

    @Override
    public void deletePerson(long id) {
        repository.delete(id);
    }

    @Override
    public List<Person> findAllPersons() {
        return repository.findAll();
    }

    @Override
    public void saveAllPersons(Collection<Person> persons) {
        repository.save(persons);
    }

    @Override
    public void deleteAllPersons() {
        repository.deleteAll();
    }

    //TODO Add the new Query to the service and the interface to make it useable
}
