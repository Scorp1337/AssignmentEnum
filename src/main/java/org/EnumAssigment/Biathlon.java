package org.EnumAssigment;

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

    public void listAthlete() {
        for (Athlete athlete : athleteList) {
            System.out.println(athlete);
        }

    }

}

