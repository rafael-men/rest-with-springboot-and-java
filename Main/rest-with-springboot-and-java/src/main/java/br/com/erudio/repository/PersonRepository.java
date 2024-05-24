package br.com.erudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.erudio.data.model.User;



@Repository
public interface PersonRepository extends JpaRepository<br.com.erudio.data.model.Person,Long>{
	
	@Modifying
	@Query("UPDATE Person p p.enabled = false WHERE p.id = :id")
    User disablePerson(@Param("id") Long id);

}
