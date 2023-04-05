package org.IOAssignment;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class AthleteTest {

    @Test
    void calculateHowManySecondsInPenaltiesWeGet() {

        Athlete athlete1 = new Athlete(1, "Jhon", "DE", 1250,
                "xxxoo", "oxxxx", "xoxxxx");


        int penalties = athlete1.calculatePenalties();

        assertEquals(40, penalties);
    }

    @Test
    void calculateTheFinalStandings() {
        Athlete athlete1 = new Athlete(1, "Jhon", "DE", 1250,
                "xxxoo", "oxxxx", "xoxxxx");


        int result = athlete1.getSessionTimeInSeconds() + athlete1.calculatePenalties();

        assertEquals(1290, result);

        
    }





}
