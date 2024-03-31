package com.example.MyBudget.service;

import com.example.MyBudget.domain.Budget;

import java.util.List;

public interface BudgetService {
    public List<Budget> findAll();
    public Budget findById(int theID);

    public List<Budget> listAll(String keyword);

}
