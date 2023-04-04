package org.IOAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiathlonTest {

    @Test
    void givenOneAthleteAddItToList() {

        Biathlon myBiathlon = new Biathlon();
        Athlete athlete = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");

        myBiathlon.addAthlete(athlete);

        assertEquals(1,myBiathlon.athleteList.size());

    }
}