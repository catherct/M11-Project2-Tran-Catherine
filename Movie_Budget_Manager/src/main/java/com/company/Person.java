package com.company;

public abstract class Person {

    protected String name;
    protected double pay;
    protected double earned; // what is earned?

    public Person(String name, double pay, double earned) {
        name = name;
        pay = pay;
        earned = earned;
    }

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

    public abstract double pay();

}
