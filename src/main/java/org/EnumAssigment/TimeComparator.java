package org.EnumAssigment;

import java.util.Comparator;

public class TimeComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o1.calculateFinalStanding() < o2.calculateFinalStanding()) {
            return 1;
        }else{
            return -1;
        }
    }

}
