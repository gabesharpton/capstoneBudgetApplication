package com.example.MyBudget.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


//public interface BalanceRepository extends CrudRepository<Balance,Long> {
//    @Query("SELECT p FROM Balance p WHERE p.name LIKE %?1%")
//    public List<Balance> search(String keyword);
//}