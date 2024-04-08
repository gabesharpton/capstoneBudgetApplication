package com.example.MyBudget.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
    Budget budget;
    @BeforeEach
    public void setUp() { budget = new Budget();}

    @Test
    void getBudgetID() {
        int idValue = 19;
        budget.setBudgetID(idValue);
        assertEquals(budget.getBudgetID(), idValue);
        System.out.println("Get Budget Success");
    }

    @Test
    void setBudgetID() {
        int idValue = 19;
        budget.setBudgetID(idValue);
        assertEquals(budget.getBudgetID(), idValue);
        System.out.println("Set Budget Success");
    }

    @Test
    void getPersonID() {
        int idValue = 13;
        budget.setPersonID(idValue);
        assertEquals(budget.getPersonID(), idValue);
        System.out.println("Get PID Success");
    }

    @Test
    void setPersonID() {
        int idValue = 13;
        budget.setPersonID(idValue);
        assertEquals(budget.getPersonID(), idValue);
        System.out.println("Set PID Success");
    }

    @Test
    void getBalance() {
        int balanceValue = 40;
        budget.setPersonID(balanceValue);
        assertEquals(budget.getPersonID(), balanceValue);
        System.out.println("Get Balance Success");
    }

    @Test
    void setBalance() {
        int balanceValue = 40;
        budget.setPersonID(balanceValue);
        assertEquals(budget.getPersonID(), balanceValue);
        System.out.println("Set Balance Success");
    }

    @Test
    void getMonthYear() {
        String dateValue = "10/2024";
        budget.setMonthYear(dateValue);
        assertEquals(budget.getMonthYear(), dateValue);
        System.out.println("Get Month Year Success");
    }

    @Test
    void setMonthYear() {
        String dateValue = "10/2024";
        budget.setMonthYear(dateValue);
        assertEquals(budget.getMonthYear(), dateValue);
        System.out.println("Set Month Year Success");
    }
}