package com.elyntsev.service;

import com.elyntsev.dao.PersonDao;
import com.elyntsev.domain.Person;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
