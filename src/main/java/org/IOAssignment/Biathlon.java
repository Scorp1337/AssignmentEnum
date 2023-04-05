package org.IOAssignment;

import java.util.ArrayList;
import java.util.List;

public class Biathlon {

    public List<Athlete> athleteList = new ArrayList<>();


    public void addAthlete(Athlete athlete) {
        if (athleteList.contains(athlete)) {
            System.out.println("Athlete already on the list.");
        } else {
            athleteList.add(athlete);
        }
    }

    public void displayAthletesByFinalStandingOrder(List<Athlete> athleteList) {
        athleteList.sort(new StandingComparator());
        int placement = 1;

        for (Athlete athlete : athleteList) {
            System.out.println((placement++) + " - " + athlete);
        }
    }

}

