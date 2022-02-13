package com.elyntsev.dao;


import com.elyntsev.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao {

    Person findByName(String name);
}
