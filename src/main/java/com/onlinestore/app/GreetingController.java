package com.onlinestore.app;

import com.onlinestore.app.entities.Person;
import com.onlinestore.app.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class GreetingController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String greeting(Map<String, Object> model){
        return "greeting";
    }

    @GetMapping("/add")
    @ResponseBody
    public String addNewPerson(/*@RequestParam Integer id,*/ @RequestParam String name, @RequestParam String email){
        Person person = new Person();
        //person.setId(id);
        person.setName(name);
        person.setEmail(email);
        personRepository.save(person);
        return "saved";
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Iterable<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @GetMapping("/hello")
    public String hello(Model model){
        return "hello";
    }

    @GetMapping("/file1")
    public String getFile1(Model model){
        return "file1";
    }

    @GetMapping("/helloreact")
    public String getHelloreactPage(Model model) {
        return "helloreact";
    }
}
