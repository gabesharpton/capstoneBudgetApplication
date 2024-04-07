package com.example.MyBudget.domain;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Bills")
public class Bills implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int billID;
    int billAmount;
    String billName;
    String billDate;

    public Bills() {}
    public Bills(int billID, int billAmount, String billName, String billDate) {
        this.billID = billID;
        this.billAmount = billAmount;
        this.billName = billName;
        this.billDate = billDate;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

}
