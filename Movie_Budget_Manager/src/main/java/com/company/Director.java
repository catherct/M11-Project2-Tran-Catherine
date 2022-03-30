package com.company;

public class Director extends Crew {


    // constructor of Director class
    public Director(String name, double pay, String department) {
        super(name, pay, department);
    }


    // director makes 1% royalty based on movie profits
    public double pay(double profits){
        return profits * 0.01;
    }
}
