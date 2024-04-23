package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import Model.Person;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		logger.info("Finding all the people...");
		List<Person> persons = new ArrayList<>();
		return persons;
		
		for(int i = 0; i < 8 ; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	public Person findById(String id) {
		logger.info("Finding a Person...");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstname("Rafael");
		person.setSurname("Menezes");
		person.setAddress("Aracaju - Sergipe - Brazil");
		person.setGender("Non Binary");
		return person;
	}
	
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstname("Person Name: " + i);
		person.setSurname("Person Surname: " + i );
		person.setAddress("Some address..." + i);
		person.setGender("Non Binary");
		return person;
	}
}
