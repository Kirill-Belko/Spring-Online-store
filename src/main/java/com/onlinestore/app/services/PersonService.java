package com.onlinestore.app.services;

import antlr.StringUtils;
import com.onlinestore.app.entities.Person;
import com.onlinestore.app.entities.Roles;
import com.onlinestore.app.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.UUID;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private MailSender mailSender;

    public boolean addPerson(Person person){
        Person personFromDb = personRepository.findByName(person.getName());

        if (personFromDb != null){
            return false;
        }

        person.setActive(true);
        person.setRoles(Collections.singleton(Roles.USER));
        person.setActivationCode(UUID.randomUUID().toString());
        personRepository.save(person);

        if(!person.getEmail().isEmpty()){
            mailSender.send(person.getEmail(), "test", "test message");
        }

        return true;
    }

    public boolean activatePerson(String code) {
        Person person = personRepository.findByActivationCode(code);
        if(person == null){
            return false;
        }

        person.setActivationCode(null);

        personRepository.save(person);

        return true;
    }
}
