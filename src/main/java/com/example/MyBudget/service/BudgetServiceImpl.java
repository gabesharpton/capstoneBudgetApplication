package com.example.MyBudget.service;

import com.example.MyBudget.domain.Budget;
import com.example.MyBudget.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BudgetServiceImpl implements BudgetService{
    private BudgetRepository budgetRepository;
    @Autowired
    public BudgetServiceImpl(BudgetRepository budgetRepository) { this.budgetRepository = budgetRepository;}
    public List<Budget> findAll() { return (List<Budget>) budgetRepository.findAll();}

    @Override
    public Budget findById(int theID) {

        Long theIdl=(long)theID;
        Optional<Budget> result = budgetRepository.findById(theIdl);

        Budget theBudget = null;

        if (result.isPresent()) {
            theBudget = result.get();
        }
        else {
            // we didn't find the product id
            throw new RuntimeException("Did not find bill id - " + theID);
        }

        return theBudget;
    }

    @Override
    public List<Budget> listAll(String keyword) {
        if(keyword != null){
            return budgetRepository.search(keyword);
        }
        return (List<Budget>) budgetRepository.findAll();
    }
    public void save(Budget theBudget){
        budgetRepository.save(theBudget);
    }

}
