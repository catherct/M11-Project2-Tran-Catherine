package com.company;

public class Crew extends Person {

    // property exclusive to Crew class
    private String department;


    // constructor of the Crew class
    public Crew(String name, double pay, double earned, String department) {
        super(name, pay, earned);
        department = department;
    }


    // getter and setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    // base pay method for all crew
    public double pay(){
        return pay;
    }

}
