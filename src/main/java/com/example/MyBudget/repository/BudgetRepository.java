package com.example.MyBudget.repository;

import com.example.MyBudget.domain.Budget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BudgetRepository extends CrudRepository<Budget,Long> {
    @Query("SELECT b FROM Budget b WHERE b.monthYear LIKE %?1%")
    public List<Budget> search(String keyword);
}