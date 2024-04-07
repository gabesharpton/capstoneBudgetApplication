package com.example.MyBudget.repository;

import com.example.MyBudget.domain.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Long> {
    @Query("SELECT p FROM Person p WHERE p.personName LIKE %?1%")
    public List<Person> search(String keyword);
}
