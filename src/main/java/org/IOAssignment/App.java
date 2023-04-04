package org.IOAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * - create a csv file;
 * - read csv file;
 * - add csv file as objects;
 * - calculate shooting penalties;
 * - calculate final standings (session time + penalties)
 * TASK
 * - write tests for the CSV parsing and the standing calculation
 * - in  your tests you must not use real files
 * - make sure the CSVs are read from memory to keep the tests fast
 * - use Comparator / Comparable for sorting
 * - use at least 1 Enum (in any situation) and at least 2 Annotations (they don't need to be custom)
 */
public class App {
    public static void main(String[] args) {

        String file = "file.csv";
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        Biathlon myBiathlon = new Biathlon();


        Athlete athlete1 = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");

        Athlete athlete2 = new Athlete(1, "Jimmy Smiles", "UK", 1755
                , "xxoox", "xooxo", "xxxxo");

        Athlete athlete3 = new Athlete(27, "Piotr Smitzer", "CZ", 1810
                ,"xxxxx", "xxxxx", "xxxxx");



        myBiathlon.addAthlete(athlete1);
        myBiathlon.addAthlete(athlete2);
        myBiathlon.addAthlete(athlete3);

        TreeSet<Athlete> winners = new TreeSet<>(new StandingComparator());

        winners.add(athlete1);
        winners.add(athlete2);
        winners.add(athlete3);

        System.out.println("Podium: ");


        int placement=1;
        for(Athlete athlete : winners)
            System.out.println((placement++)+ " "+ athlete );


    }
}





