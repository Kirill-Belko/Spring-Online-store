package com.onlinestore.app.repositories;

import com.onlinestore.app.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByName(String name);

    Person findByActivationCode(String code);
}
