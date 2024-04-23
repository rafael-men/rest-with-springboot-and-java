package br.com.erudio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{}
