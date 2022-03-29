package com.company;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    // properties of Movie class
    private String genre;
    private Director director;
    private List <Actor> castMembers;
    private List <Crew> crewMembers;
    private int budget;
    private int moneySpent; // moneySpent will be calculated via a method // "0"
    private int moneyEarned; // moneyEarned is total grossed from box offices?
    private int profits; // profits will be calculated via a method (moneyEarned + budget - moneySpent)


    // constructor of Movie class (allows user to call new Movie object)
    public Movie(String genre, Director director, List<Actor> castMembers, List<Crew> crewMembers, int budget,
                 int moneySpent, int moneyEarned, int profits) {
        genre = genre;
        director = director;
        castMembers = castMembers;
        crewMembers = crewMembers;
        budget = budget;
        moneySpent = moneySpent;
        moneyEarned = moneyEarned;
        profits = profits;
    }


    // getters and setters
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(List<Actor> castMembers) {
        this.castMembers = castMembers;
    }

    public List<Crew> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<Crew> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(int moneySpent) {
        this.moneySpent = moneySpent;
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(int moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public int getProfits() {
        return profits;
    }

    public void setProfits(int profits) {
        this.profits = profits;
    }


    // method to calculate profit
    public int updateProfits(int budget, int moneyEarned, int moneySpent){
        return budget + moneyEarned - moneySpent; // moneyEarned here is the money grossed at box office
    }

    // payday method pays all actors and crew + adds total to moneySpent
//    public int payday(int moneyEarned, int moneySpent){
//        return moneyEarned - moneySpent;
//    }

}
