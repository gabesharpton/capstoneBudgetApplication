package com.example.MyBudget.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Budget")
public class Budget implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int budgetID;

    int personID;
    @Min(value = 0,message = "Must be larger than 0")
    int balance;
    @Column(unique = true)
    @Pattern(regexp = "^(0[1-9]|1[0-2])\\/(20[2-9][0-9]|2[1-9][0-9]{2}|30[0-5][0-9]|306[0-4])$", message="Follow format MM/YYYY")
    String monthYear;

    public Budget() {}

    public Budget(int budgetID, int personID, int balance, String monthYear) {
        this.budgetID = budgetID;
        this.personID = personID;
        this.balance = balance;
        this.monthYear = monthYear;
    }

    public int getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(int budgetID) {
        this.budgetID = budgetID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

}
