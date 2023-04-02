package org.EnumAssigment;

public class Athlete {

    private final int number;
    private final String name;

    private final String countryCode;

    private final int sessionTimeInSeconds;

    private final ShootingRange shootingRange;


    public Athlete(int number, String name, String countryCode, int sessionTimeInSeconds, ShootingRange shootingRange) {
        this.number = number;
        this.name = name;
        this.countryCode = countryCode;
        this.sessionTimeInSeconds = sessionTimeInSeconds;
        this.shootingRange = shootingRange;

    }

    public int calculatePenalties(){

        String totalShots = shootingRange.getShootingRange1() + shootingRange.getShootingRange2()+ shootingRange.getShootingRange3();
        int penalties =0;
        for(int i =0; i < totalShots.length();i++){
            if(totalShots.charAt(i) == 'o'){
                penalties += 10;
            }
        }
        return penalties;
    }

    public int  calculateFinalStandings(){

        int finalStandingsInSeconds;

        finalStandingsInSeconds = sessionTimeInSeconds + calculatePenalties();

        return finalStandingsInSeconds;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Athlete [Number: " + number + ", Name: " + name + ", Country: " + countryCode + ", Session time: "+ sessionTimeInSeconds + "]";
    }

}
