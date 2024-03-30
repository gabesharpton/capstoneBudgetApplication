package com.example.MyBudget.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//public interface BillsRepository extends CrudRepository<Bills,Long> {
//    @Query("SELECT p FROM Bills p WHERE p.name LIKE %?1%")
//    public List<Bills> search(String keyword);
//}