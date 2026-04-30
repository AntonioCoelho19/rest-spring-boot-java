package io.github.AntonioCoelho19;

import io.github.AntonioCoelho19.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        logger.info("Finding all People!");

        List<Person> people = new ArrayList<Person>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            people.add(person);
        }
        return people;
    }


    public Person findById(String id){
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Joesley");
        person.setLastName("Pinto");
        person.setAddress("Rolandia - PR");
        person.setGender("Macho alfa");
        return person;
    }

    public Person create(Person person){
        logger.info("Creating one Pearson");

        return person;
    }


    public Person update(Person person){
        logger.info("Updating one Pearson");

        return person;
    }


    public void delete(String id){
        logger.info("Deleting one Pearson");

    }


    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName " + i);
        person.setLastName("LastName " + i);
        person.setAddress("Some place in the World");
        person.setGender("?");
        return person;
    }
}
