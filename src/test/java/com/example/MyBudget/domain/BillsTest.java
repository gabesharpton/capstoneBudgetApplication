package com.example.MyBudget.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillsTest {
    Bills bills;
    @BeforeEach
    public void setUp() { bills = new Bills(); }

    @Test
    void getBillID() {
        int idValue = 15;
        bills.setBillID(idValue);
        assertEquals(bills.getBillID(), idValue);
        System.out.println("Get Bill Success");
    }

    @Test
    void setBillID() {
        int idValue = 15;
        bills.setBillID(idValue);
        assertEquals(bills.getBillID(), idValue);
        System.out.println("Set Bill Success");
    }

    @Test
    void getBillAmount() {
        int amountValue = 60;
        bills.setBillAmount(amountValue);
        assertEquals(bills.getBillAmount(), amountValue);
        System.out.println("Get Amount Success");
    }

    @Test
    void setBillAmount() {
        int amountValue = 60;
        bills.setBillAmount(amountValue);
        assertEquals(bills.getBillAmount(), amountValue);
        System.out.println("Set Amount Success");
    }

    @Test
    void getBillName() {
        String nameValue = "Tony";
        bills.setBillName(nameValue);
        assertEquals(bills.getBillName(), nameValue);
        System.out.println("Get Name Success");
    }

    @Test
    void setBillName() {
        String nameValue = "Tony";
        bills.setBillName(nameValue);
        assertEquals(bills.getBillName(), nameValue);
        System.out.println("Set Name Success");
    }

    @Test
    void getBillDate() {
        String dateValue = "10/2024";
        bills.setBillDate(dateValue);
        assertEquals(bills.getBillDate(), dateValue);
        System.out.println("Get Date Success");
    }

    @Test
    void setBillDate() {
        String dateValue = "10/2024";
        bills.setBillDate(dateValue);
        assertEquals(bills.getBillDate(), dateValue);
        System.out.println("Set Date Success");
    }
}