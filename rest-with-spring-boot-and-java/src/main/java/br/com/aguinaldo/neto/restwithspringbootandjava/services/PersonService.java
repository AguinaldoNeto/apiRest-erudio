package br.com.aguinaldo.neto.restwithspringbootandjava.services;

import br.com.aguinaldo.neto.restwithspringbootandjava.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong couter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person create(Person person) {
        logger.info("Creating one person.");

        return person;
    }

    public Person update(Person person) {
        logger.info("Updating one person.");

        return person;
    }

    public void delete(String id) {
        logger.info("Deleting one person.");
    }

    public Person findById(String id) {
        logger.info("Finding one person.");

         Person person = new Person();
         person.setId(couter.incrementAndGet());
         person.setFirstName("Aguinaldo");
         person.setLastName("Neto");
         person.setAddress("Rua A");
         person.setGender("M");

        return person;
    }

    public List<Person> findAll() {
        logger.info("Finding one person.");

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }


    private Person mockPerson(int i) {
        logger.info("Finding ALL person.");

        Person person = new Person();
        person.setId(couter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name" + i);
        person.setAddress("Address" + i);
        person.setGender("Gender" + i);

        return person;
    }
}
