package com.elyntsev.dao;

import com.elyntsev.domain.Person;
import org.springframework.stereotype.Repository;


@Repository
public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
