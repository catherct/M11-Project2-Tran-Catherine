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
    private int moneySpent;
    private int moneyEarned;
    private int profits;


    // constructor of Movie class (allows user to call new Movie object)
    public Movie(String genre, Director director, List<Actor> castMembers, List<Crew> crewMembers, int budget) {
        this.genre = genre;
        this.director = director;
        this.castMembers = castMembers;
        this.crewMembers = crewMembers;
        this.budget = budget;
        this.moneySpent = 0;
        this.moneyEarned = 0;
        this.profits = 0;
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


    // payday method pays all actors and crew and adds total to moneySpent (calculates spent)
    public void payday() {

        for (int i = 0; i < castMembers.length; i++) {
            int payCast = ;
        }

        for (int i = 0; i < crewMembers.length; i++) {
            int payCrew = ;
        }



    }       // moneySpent should total to 46,077,760 (crew, director, cast)


    // method to calculate percent of budget spent on movie
    public int percentSpent(int budget, int moneySpent){
        return moneySpent / budget;
    }


    // method to calculate profit
    public int updateProfits(int budget, int moneyEarned, int moneySpent){
        moneyEarned = 347300000; // total grossed in box office sales ( $347.3M )
        profits = budget + moneyEarned - moneySpent;
        return profits;
    }

}
