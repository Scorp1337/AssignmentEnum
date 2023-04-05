package org.IOAssignment;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiathlonTest {
    @Test
    void givenZeroAthletesAddedToList() {

        Biathlon myBiathlon = new Biathlon();
        Athlete athlete = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");


        assertEquals(0, myBiathlon.athleteList.size());
    }

    @Test
    void givenOneAthleteAddedToList() {

        Biathlon myBiathlon = new Biathlon();
        Athlete athlete = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");

        myBiathlon.addAthlete(athlete);

        assertEquals(1, myBiathlon.athleteList.size());

    }

    @Test
    void givenTwoAthletesAddedToList() {

        Biathlon myBiathlon = new Biathlon();
        Athlete athlete = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");
        Athlete athlete2 = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");


        myBiathlon.addAthlete(athlete);
        myBiathlon.addAthlete(athlete2);

        assertEquals(2, myBiathlon.athleteList.size());

    }


    @Test
    void displayAthletesByFinalStandingOrder() {
        Biathlon myBiathlon = new Biathlon();
        myBiathlon.athleteList = new ArrayList<>();

        Athlete athlete1 = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");

        Athlete athlete2 = new Athlete(1, "Jimmy Smiles", "UK", 1755
                , "xxoox", "xooxo", "xxxxo");

        Athlete athlete3 = new Athlete(27, "Piotr Smitzer", "CZ", 1810
                , "xxxxx", "xxxxx", "xxxxx");

        myBiathlon.addAthlete(athlete1);
        myBiathlon.addAthlete(athlete2);
        myBiathlon.addAthlete(athlete3);

        athlete1.finalStandingsInSeconds = athlete1.getSessionTimeInSeconds() + athlete1.calculatePenalties();
        athlete2.finalStandingsInSeconds = athlete2.getSessionTimeInSeconds() + athlete2.calculatePenalties();
        athlete3.finalStandingsInSeconds = athlete3.getSessionTimeInSeconds() + athlete3.calculatePenalties();

        List<Athlete> testList = myBiathlon.athleteList;
        testList.sort(new StandingComparator());

        assertEquals(myBiathlon.athleteList,testList);


    }
}