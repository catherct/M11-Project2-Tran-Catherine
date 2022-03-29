package com.company;

public class Actor extends Person {

    // property exclusive to Actor class
    private String role;


    // constructor of Actor class
    public Actor(String name, double pay, double earned, String role) {
        super(name, pay, earned);
        role = role;
    }


    // getter and setter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    // actor makes money based on movie profits?
    public double pay(){
        return pay;
    }
}
