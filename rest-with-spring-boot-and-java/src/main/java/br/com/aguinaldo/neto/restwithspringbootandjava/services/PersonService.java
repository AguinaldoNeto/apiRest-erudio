package br.com.aguinaldo.neto.restwithspringbootandjava.services;

import br.com.aguinaldo.neto.restwithspringbootandjava.exceptions.ResourceNotFoundException;
import br.com.aguinaldo.neto.restwithspringbootandjava.model.Person;
import br.com.aguinaldo.neto.restwithspringbootandjava.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    @Autowired
    public PersonRepository repository;

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person create(Person person) {
        logger.info("Creating one person.");
        return repository.save(person);
    }

    public Person findById(Long id) {
        logger.info("Finding one person.");
        return repository
                .findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("No records found for this ID!"));
    }

    public List<Person> findAll() {
        logger.info("Finding ALL person.");
        return repository.findAll();
    }

    public Person update(Person person) {
        logger.info("Updating one person.");

        Person foundedPerson = repository
                .findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        foundedPerson.setFirstName(person.getFirstName());
        foundedPerson.setLastName(person.getLastName());
        foundedPerson.setAddress(person.getAddress());
        foundedPerson.setGender(person.getGender());

        return repository.save(foundedPerson);
    }

    public void delete(Long id) {
        logger.info("Deleting one person.");

        Person foundedPersonId = repository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        repository.delete(foundedPersonId);
    }


}
