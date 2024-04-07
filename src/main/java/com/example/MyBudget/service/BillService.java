package com.example.MyBudget.service;

import com.example.MyBudget.domain.Bills;


import java.util.List;

public interface BillService {

    public List<Bills> findAll();
    public Bills findById(int theID);
    public void save(Bills theBill);

    public List<Bills> listAll(String keyword);

}
