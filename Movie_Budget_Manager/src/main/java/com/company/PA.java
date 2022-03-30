package com.company;

public class PA extends Crew {

    // property exclusive to PA class
    protected int hoursWorked;


    // constructor of PA class
    public PA(String name, double pay, String department, int hoursWorked) {
        super(name, pay, department);
        this.hoursWorked = hoursWorked;
    }


    // getter and setter
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    // PA makes money based on hours worked (pay rate here is $18/hr)
    public double pay(int hoursWorked) {
        double payRate = 18.00;
        return payRate * hoursWorked;
    }


}
