package com.springboot.controller;

import com.springboot.bean.Person;
import com.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangsong on 2018/10/29.
 */

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/norollback")
    public Person noRollback(Person person) {
        return personService.savePersonWithoutRollBack(person);
    }

    @RequestMapping("/rollback")
    public Person rollback(Person person) {
        return personService.savePersonWithRollBack(person);
    }

    @RequestMapping("/put")
    public Person put(Person person) {
        return personService.save(person);
    }

    @RequestMapping("/able")
    public Person cacheable(Person person) {
        return personService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {
        personService.remove(id);
        return "ok";
    }

}
