package com.company;

public class Actor extends Person {

    // property exclusive to Actor class
    private String role;


    // constructor of Actor class
    public Actor(String name, double pay, String role) {
        super(name, pay);
        this.role = role;
    }


    // getter and setter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    /* actors make money based on their contracts (how much actor is on set) --
            amounts will be set for each actor listed */
    public double pay(){
        return pay;
    }
}
