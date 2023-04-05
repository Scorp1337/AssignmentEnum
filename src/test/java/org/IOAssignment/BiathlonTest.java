package org.IOAssignment;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(1,myBiathlon.athleteList.size());

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

        assertEquals(2,myBiathlon.athleteList.size());

    }


    @Test
    void displayAthletesByFinalStandingOrder() {
        Biathlon myBiathlon = new Biathlon();

        Athlete athlete1 = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");

        Athlete athlete2 = new Athlete(1, "Jimmy Smiles", "UK", 1755
                , "xxoox", "xooxo", "xxxxo");

        Athlete athlete3 = new Athlete(27, "Piotr Smitzer", "CZ", 1810
                ,"xxxxx", "xxxxx", "xxxxx");

        myBiathlon.addAthlete(athlete1);
        myBiathlon.addAthlete(athlete2);
        myBiathlon.addAthlete(athlete3);

        fail("Nu reusesc sa demonstrez ca sortarea atletilor este corecta");


    }
}