package com.example.MyBudget.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name="Person")

public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int personID;
    @Min(value = 0,message = "Must be larger than 0")
    int income;
    @Min(value = 0,message = "Must be larger than 0")
    int savings;
    @NotNull
    String yearlyGoal;
    String personName;

    public Person() {}

    public Person(int personID, int income, int savings, String yearlyGoal, String personName) {
        this.personID = personID;
        this.income = income;
        this.savings = savings;
        this.yearlyGoal = yearlyGoal;
        this.personName =  personName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public String getYearlyGoal() {
        return yearlyGoal;
    }

    public void setYearlyGoal(String yearlyGoal) {
        this.yearlyGoal = yearlyGoal;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}
