package org.EnumAssigment;

public enum ShootingRange {

    SHOOTING_RANGE_ATHLETE1("xxxox", "xxxxx", "xxoxo"),SHOOTING_RANGE_ATHLETE2("xxoox", "xooxo", "xxxxo"),
    SHOOTING_RANGE_ATHLETE3("xxxxx", "xxxxx", "xxxxx");

    private final String shootingRange1;
    private final String shootingRange2;
    private final String shootingRange3;

    ShootingRange(String shootingRange1, String shootingRange2, String shootingRange3) {
        this.shootingRange1 = shootingRange1;
        this.shootingRange2 = shootingRange2;
        this.shootingRange3 = shootingRange3;
    }


    public String getShootingRange1() {
        return shootingRange1;
    }

    public String getShootingRange2() {
        return shootingRange2;
    }

    public String getShootingRange3() {
        return shootingRange3;
    }
}
