package org.EnumAssigment;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class AthleteTest {

    @Test
    void calculateHowManySecondsInPenaltiesWeGet() {
        String shots = "xoxoxoxoxxxxo";
        int penalties = 0;

        int missShot = 10;

        for(int i=0; i < shots.length();i++){
            if(shots.charAt(i) =='o'){
                penalties = penalties + missShot;
            }
        }
        System.out.println(penalties);
        assertEquals(50,penalties);
    }

        @Test
        void calculateTheFinalStandings(){
        int finalStanding = 1000;
        int penalties = 50;

        int finalStandingResult = finalStanding + penalties;

        System.out.println(finalStandingResult);
        assertEquals(1050,finalStandingResult);
    }

}

