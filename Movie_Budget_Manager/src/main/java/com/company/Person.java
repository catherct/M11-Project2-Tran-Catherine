package com.company;

public abstract class Person {

    // properties of base class Person
    protected String name;
    protected double pay;
    protected double earned;


    // constructor of Person class
    public Person(String name, double pay) {
        this.name = name;
        this.pay = pay;
        this.earned = 0;
    }


    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaid() {
        return pay;
    }

    public void setPaid(double pay) {
        this.pay = pay;
    }

    public double getEarned() {
        return earned;
    }

    public void setEarned(double earned) {
        this.earned = earned;
    }


    // abstract pay method
    public abstract double pay();

}
