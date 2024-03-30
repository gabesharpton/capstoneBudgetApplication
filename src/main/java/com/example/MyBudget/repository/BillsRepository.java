package com.example.MyBudget.repository;

import com.example.MyBudget.domain.Bills;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BillsRepository extends CrudRepository<Bills,Long> {
    @Query("SELECT b FROM Bills b WHERE b.billName LIKE %?1%")
    public List<Bills> search(String keyword);
}


