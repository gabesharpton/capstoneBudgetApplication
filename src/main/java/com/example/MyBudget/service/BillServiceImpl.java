package com.example.MyBudget.service;

import com.example.MyBudget.domain.Bills;
import com.example.MyBudget.repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BillServiceImpl implements BillService{

    private BillsRepository billsRepository;
//    @Autowired
    public BillServiceImpl(BillsRepository billsRepository) { this.billsRepository = billsRepository;}
    public List<Bills> findAll() { return (List<Bills>) billsRepository.findAll();}

    @Override
    public Bills findById(int theID) {

        Long theIdl=(long)theID;
        Optional<Bills> result = billsRepository.findById(theIdl);

        Bills theBills = null;

        if (result.isPresent()) {
            theBills = result.get();
        }
        else {
            // we didn't find the product id
            throw new RuntimeException("Did not find bill id - " + theID);
        }

        return theBills;
    }


    @Override
    public List<Bills> listAll(String keyword) {
        if(keyword != null){
            return billsRepository.search(keyword);
        }
        return (List<Bills>) billsRepository.findAll();
    }

    @Override
    public void save(Bills theBill) {
        billsRepository.save(theBill);
    }

    @Override
    public void deleteById(int theID){
        Long theIDL=(long)theID;
        billsRepository.deleteById(theIDL);
    }

}
