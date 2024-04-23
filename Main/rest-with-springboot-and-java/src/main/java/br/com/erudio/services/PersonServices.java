package br.com.erudio.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Person;
import br.com.erudio.PersonRepository;
import br.com.erudio.exceptions.ResourceNotFoundException;

@Service
public class PersonServices {
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		logger.info("Finding all the people...");
		return repository.findAll();
	}

	public Person findById(Long id) {
		logger.info("Finding a Person...");
		Person person = new Person();
		person.setFirstname("Rafael");
		person.setSurname("Menezes");
		person.setAddress("Aracaju - Sergipe - Brazil");
		person.setGender("Non Binary");
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No record for this id"));
	}
	
	public Person create(Person person) {
		logger.info("Creating a new user");
		return repository.save(person);
	}
	
	public Person update(Person person) {
		logger.info("Updating a existent user");
		var entity =  repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No record for this id"));
		entity.setFirstname(person.getFirstname());
		entity.setSurname(person.getSurname());
		entity.setAddress(person.getAddress());
		person.setGender(person.getGender());
		return repository.save(person);
	}
	
	public void delete(Long id) {
		logger.info("Deleting a existent user");
		var entity =  repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No Records Found By Id..."));
		repository.delete(entity);
    }
}
