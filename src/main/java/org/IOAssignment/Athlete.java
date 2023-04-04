package org.IOAssignment;

public class Athlete {

    private final int number;
    private final String name;

    private final String countryCode;

    private final int sessionTimeInSeconds;

    private final String shootingRange1;
    private final String shootingRange2;
    private final String shootingRange3;
    int finalStandingsInSeconds = 0;

    public Athlete(int number, String name, String countryCode, int sessionTimeInSeconds, String shootingRange1, String shootingRange2, String shootingRange3) {
        this.number = number;
        this.name = name;
        this.countryCode = countryCode;
        this.sessionTimeInSeconds = sessionTimeInSeconds;

        this.shootingRange1 = shootingRange1;
        this.shootingRange2 = shootingRange2;
        this.shootingRange3 = shootingRange3;

    }

    public int calculatePenalties() {

        String totalShots = shootingRange1 + shootingRange2 + shootingRange3;
        int penalties = 0;
        for (int i = 0; i < totalShots.length(); i++) {
            if (totalShots.charAt(i) == 'o') {
                penalties += 10;
            }
        }
        return penalties;
    }

    public int calculateFinalStandings() {

        finalStandingsInSeconds = sessionTimeInSeconds + calculatePenalties();

        return finalStandingsInSeconds;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Athlete [Nr: " + number + ", Name: " + name + ", Final standings: " + finalStandingsInSeconds + "]";
    }

}
