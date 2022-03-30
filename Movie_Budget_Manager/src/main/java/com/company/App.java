package com.company;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        // instantiate director object
        Director director = new Director("Brett Ratner", 5000000, 0, "director");


        // instantiate list of actor objects
        List<Actor> castMembers = new ArrayList<>();

            Actor firstLead = new Actor("Jackie Chan", 15000000, 0, "lead actor");
            Actor secondLead = new Actor("Chris Tucker", 20000000, 0, "lead actor");

            castMembers.add(firstLead);
            castMembers.add(secondLead);


        // instantiate list of crew objects
        List<Crew> crewMembers = new ArrayList<>();

            PA productionAssistant = new PA("Smitty McSmittysen", 18.00, 0, "production", 4320);
            Crew firstProducer = new Crew("Roger Birnbaum", 100000, 0, "production");
            Crew secondProducer = new Crew("Jonathan Glickman", 100000, 0, "production");
            Crew thirdProducer = new Crew("Arthur M. Sarkissian", 100000, 0, "production");
            Crew fourthProducer = new Crew("Jay Stern", 100000, 0, "production");
            Crew editor = new Crew("Mark Helfrich", 600000, 0, "post-production");

            crewMembers.add(productionAssistant);
            crewMembers.add(firstProducer);
            crewMembers.add(secondProducer);
            crewMembers.add(thirdProducer);
            crewMembers.add(fourthProducer);
            crewMembers.add(editor);


        // instantiate movie object
        Movie RushHour2 = new Movie("buddy cop comedy", director, castMembers, crewMembers,
                90000000);


        System.out.println(productionAssistant.payday());
        System.out.println(moneySpent); // moneySpent out of the total budget
        System.out.println(moneySpent); // moneySpent otu of the profits

        System.out.println(director.pay());

    }
}
