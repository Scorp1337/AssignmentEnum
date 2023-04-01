package org.EnumAssigment;

import java.util.ArrayList;
import java.util.List;

public class Biathlon {

    public List<Athlete> athletes = new ArrayList<>();

    public  void addAthlete(Athlete athlete){

        athletes.add(athlete);

    }
    public void listAthletes (){

        for (Athlete athlete : athletes){
            System.out.println(athlete);
        }
    }
}
