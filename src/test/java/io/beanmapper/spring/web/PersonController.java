/*
 * (C) 2014 42 bv (www.42.nl). All rights reserved.
 */
package io.beanmapper.spring.web;

import io.beanmapper.spring.model.Person;
import io.beanmapper.spring.model.PersonForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
public class PersonController {
    
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Person create(@Form(formClass = PersonForm.class) Person person) {
        return person;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Person update(@Form(formClass = PersonForm.class, mergeId = "id") Person person) {
        return person;
    }

}
