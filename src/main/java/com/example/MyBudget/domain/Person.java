package com.example.MyBudget.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Person")

public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int personID;
    int income;
    int savings;
    String yearlyGoal;

    public Person() {

    }
    public Person(int personID, int income, int savings, String yearlyGoal) {
        this.personID = personID;
        this.income = income;
        this.savings = savings;
        this.yearlyGoal = yearlyGoal;
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


}
