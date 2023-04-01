package org.EnumAssigment;




import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


public class App {

    public static void main(String[] args) throws IOException {
        String file = "file.csv";
        Path path = Paths.get(file);
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            System.out.println(line);
        }


        Biathlon myBiathlon = new Biathlon();


        Athlete athlete1 = new Athlete(11, "Umar Jorgson", "SK", 1827
                , "xxxox", "xxxxx", "xxoxo");

        Athlete athlete2 = new Athlete(1, "Jimmy Smiles", "UK", 1755
                , "xxoox", "xooxo", "xxxxo");

        Athlete athlete3 = new Athlete(27, "Piotr Smitzer", "CZ", 1810
                , "xxxxx", "xxxxx", "xxxxx");

        myBiathlon.addAthlete(athlete1);
        myBiathlon.addAthlete(athlete2);
        myBiathlon.addAthlete(athlete3);

        Winner winner1 = new Winner(athlete1.calculateFinalStanding(),athlete1.getAthleteName());
        Winner winner2 = new Winner(athlete2.calculateFinalStanding(),athlete2.getAthleteName());
        Winner winner3 = new Winner(athlete3.calculateFinalStanding(),athlete3.getAthleteName());

        athlete1.addWinner(winner3);
        athlete2.addWinner(winner2);
        athlete3.addWinner(winner1);


        TreeSet<Athlete> winners = new TreeSet<>(new TimeComparator());
        winners.add(athlete1);
        winners.add(athlete2);
        winners.add(athlete3);

        System.out.println("Winners sorted by time: ");
        for (Athlete athlete : winners){

            System.out.println( athlete.winners);
        }


        Map<String, List<Winner>> map = new HashMap<>();

        map.put("WINNER",athlete1.winners);
        map.put("RUNNER UP",athlete2.winners);
        map.put("THIRD PLACE",athlete3.winners);


        System.out.println("Winner - " + map.get("WINNER"));
        System.out.println("Runner-up - " + map.get("RUNNER UP"));
        System.out.println("Third place - " + map.get("THIRD PLACE"));
    }
}

