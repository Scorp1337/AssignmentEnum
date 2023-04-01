package org.EnumAssigment;

import java.util.ArrayList;
import java.util.List;

public class Athlete {

    private final int athleteNumber;
    private final String athleteName;

    private final String countryCode;

    private final int sessionTimeResult;

    private final String shootingRange1;
    private final String shootingRange2;
    private final String shootingRange3;

    List<Winner> winners = new ArrayList<>();


    public Athlete(int athleteNumber, String athleteName, String countryCode, int sessionTimeResult,
                   String shootingRange1, String shootingRange2, String shootingRange3) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.sessionTimeResult = sessionTimeResult;
        this.shootingRange1 = shootingRange1;
        this.shootingRange2 = shootingRange2;
        this.shootingRange3 = shootingRange3;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void addWinner(Winner winner){

        winners.add(winner);
}
    public int calculatePenalties() {

        String totalShooting = shootingRange1 + shootingRange2 + shootingRange3;

        int penalties = 0;

        for (int i = 0; i < totalShooting.length(); i++) {
            if (totalShooting.charAt(i) == 'o') {
                penalties += 10;
            }
        }
        return penalties;
    }

    public int calculateFinalStanding() {

        int penalties = calculatePenalties();

        int finalStandingResult = sessionTimeResult + penalties;
        return finalStandingResult;
    }

    @Override
    public String toString() {
        return "Number: " + athleteNumber + " Name: " + athleteName + " Country: " + countryCode;
    }


}
