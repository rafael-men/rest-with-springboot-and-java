package br.com.erudio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.dozermapper.core.DozerConverter;

import br.com.erudio.PersonRepository;
import br.com.erudio.Model.Person;
import br.com.erudio.data.vo.v1.PersonVO;
import br.com.erudio.exceptions.ResourceNotFoundException;

@Service
public class PersonServices {
	
	@Autowired
	PersonRepository repository;
		
	public PersonVO create(PersonVO person) {
		var entity = br.com.erudio.converter.DozerConverter.parseObject(person, Person.class);
		var vo = br.com.erudio.converter.DozerConverter.parseObject(repository.save(entity), PersonVO.class);
		return vo;
	}
	
	public List<PersonVO> findAll() {
		return br.com.erudio.converter.DozerConverter.parseListObjects(repository.findAll(), PersonVO.class);
	}	
	
	public PersonVO findById(Long id) {

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		return br.com.erudio.converter.DozerConverter.parseObject(entity, PersonVO.class);
	}
		
	public PersonVO update(PersonVO person) {
		var entity = repository.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		var vo = br.com.erudio.converter.DozerConverter.parseObject(repository.save(entity), PersonVO.class);
		return vo;
	}	
	
	public void delete(Long id) {
		Person entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
	}

}