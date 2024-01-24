package org.example.mandal.springboot1.repository;

import org.example.mandal.springboot1.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface MyRepository extends CrudRepository<Person,Integer> {

}
