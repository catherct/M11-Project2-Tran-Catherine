package com.company;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Director director = new Director("Brett Ratner", 5000000, 0, "director");
        Actor firstLead = new Actor("Jackie Chan", 15000000, 0, "lead actor");
        Actor secondLead = new Actor("Chris Tucker", 20000000, 0, "lead actor");
        PA productionAssistant = new PA("Smitty McSmittysen", 18.00, 0, "production", 4320);
        Crew firstProducer = new Crew("Roger Birnbaum", 100000, 0, "production");
        Crew secondProducer = new Crew("Jonathan Glickman", 100000, 0, "production");
        Crew thirdProducer = new Crew("Arthur M. Sarkissian", 100000, 0, "production");
        Crew fourthProducer = new Crew("Jay Stern", 100000, 0, "production");
        Crew editor = new Crew("Mark Helfrich", 600000, 0, "post-production");
        Movie RushHour2 = new Movie("buddy cop comedy", "Brett Ratner", Actor, Crew,
                90000000, 41004320, 347300000, 306295680);


        List<Actor> castMembers = new ArrayList<>();
            castMembers.add(firstLead);
            castMembers.add(secondLead);


        List<Crew> crewMembers = new ArrayList<>();
            crewMembers.add(firstProducer);
            crewMembers.add(secondProducer);
            crewMembers.add(thirdProducer);
            crewMembers.add(fourthProducer);
            crewMembers.add(editor);
            crewMembers.add(productionAssistant);

    }
}
