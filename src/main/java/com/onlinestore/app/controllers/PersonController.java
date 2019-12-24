package com.onlinestore.app.controllers;

import com.onlinestore.app.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public String personList(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "personList";
    }

}
