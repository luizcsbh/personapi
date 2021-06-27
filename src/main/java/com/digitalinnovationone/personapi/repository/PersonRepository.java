package com.digitalinnovationone.personapi.repository;

import com.digitalinnovationone.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
