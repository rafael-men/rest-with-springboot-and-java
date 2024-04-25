package br.com.erudio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonRepository extends JpaRepository<br.com.erudio.Model.Person,Long>{}
