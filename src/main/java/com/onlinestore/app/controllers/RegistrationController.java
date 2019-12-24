package com.onlinestore.app.controllers;

import com.onlinestore.app.entities.Person;
import com.onlinestore.app.entities.Roles;
import com.onlinestore.app.repositories.PersonRepository;
import com.onlinestore.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@Controller
@RequestMapping
public class RegistrationController {
    @Autowired
    private PersonService personService;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)//@PostMapping("/registration")
    public String addPerson(Person person, Model model){
        if(!personService.addPerson(person)){
            model.addAttribute("message", "User exists!");
            return "registration";
        }

        return "redirect:/login";
    }

    @GetMapping("/activate/{code}")
    public String activate(Model model, @PathVariable String code) {
        boolean isActivated = personService.activatePerson(code);

        if (isActivated){
            model.addAttribute("message", "User succesfully activated");
        } else {
            model.addAttribute("message", "Activation code is not found");
        }

        return "login";
    }
}
