package com.example.MyBudget.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;

@Entity
@Table(name="Bills")
public class Bills implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int billID;
    @Min(value = 0,message = "Must be larger than 0")
    int billAmount;
    @NotNull
    String billName;
    @Pattern(regexp = "^(0[1-9]|1[0-2])\\/(0[1-9]|[12][0-9]|3[01])$")
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
