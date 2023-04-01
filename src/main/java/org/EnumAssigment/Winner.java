package org.EnumAssigment;

public class Winner {

    private final int finalStandingResult;

    private final String name;

    public Winner(int finalStandingResult,String name) {
        this.finalStandingResult = finalStandingResult;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name " + name + " Final result: " + finalStandingResult;
     }
}
