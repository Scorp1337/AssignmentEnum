package org.IOAssignment;

import java.util.Comparator;

public class StandingComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if (o1.calculateFinalStandings() < o2.calculateFinalStandings()) {
            return -1;
        } else if (o1.calculateFinalStandings() > o2.calculateFinalStandings()) {
            return 1;
        } else {
            return 0;
        }
    }
}
