package com.elyntsev.service;


import com.elyntsev.domain.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    Person getByName(String name);
}
