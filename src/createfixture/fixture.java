package createfixture;

import java.util.*;

public class fixture {

    public static void main(String[] args) {
        System.out.println("TAKIM SAYISI GÝRÝNÝZ:");
        int takýmsayýsý;

        Scanner input = new Scanner(System.in);
        takýmsayýsý = input.nextInt();

        List<String> takýmlarýlistele = new ArrayList<>();

        for (int i = 0; i < takýmsayýsý; i++) {
            System.out.println("Takým ismi Giriniz:");
            String takýmismi = input.next();
            takýmlarýlistele.add(takýmismi);
        }

        if (takýmsayýsý % 2 != 0) {
            takýmlarýlistele.add("BAY");
            takýmsayýsý += 1;
        }

        Iterator<String> itr = takýmlarýlistele.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List<String> geçicitakýmlarýlistele = new ArrayList<>();

        for (int i = 0; i < takýmsayýsý; i++) {
            int index = (int) (Math.random() * takýmlarýlistele.size());
            takýmlarýlistele.add(takýmlarýlistele.get(index));
            takýmlarýlistele.remove(takýmlarýlistele.get(index));
        }

        geçicitakýmlarýlistele = takýmlarýlistele;

        System.out.println("***********");

        Iterator<String> itr2 = geçicitakýmlarýlistele.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        int totalround = takýmsayýsý - 1;
        int numMatchperround = takýmsayýsý / 2;

        LinkedHashMap<String, ArrayList<ArrayList<String>>> rounds = new LinkedHashMap<>();

        for (int i = 0; i < totalround; i++) {
            String round = String.valueOf(i + 1);
            rounds.put(round, new ArrayList<ArrayList<String>>());
        }

        for (int i = 0; i < totalround; i++) {
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();
            for (int j = 0; j < numMatchperround; j++) {
                home.add(takýmlarýlistele.get(j));
                away.add(takýmlarýlistele.get((takýmsayýsý - 1) - j));  //(takýmsayýsý-1)-j index of away team
            }

            String round = String.valueOf(i + 1);
            rounds.get(round).add(home);
            rounds.get(round).add(away);

            List<String> newTeams = new ArrayList<>();

            newTeams.add(takýmlarýlistele.get(0));
            newTeams.add(takýmlarýlistele.get(takýmsayýsý - 1));

            for (int k = 0; k < takýmlarýlistele.size(); k++) {
                newTeams.add(takýmlarýlistele.get(k));
            }

            takýmlarýlistele = newTeams;
        }
        System.out.println();

        for (int i = 0; i < 2 * totalround; i++) {
            System.out.println(i + 1 + ".Round");
            for (int j = 0; j < numMatchperround; j++) {
                if (i < totalround) {
                    System.out.println(rounds.get(String.valueOf(i + 1)).get(0).get(j) + " vs " + rounds.get(String.valueOf(i + 1)).get(1).get(j));
                } else {
                    System.out.println(rounds.get(String.valueOf(i + 1 - totalround)).get(1).get(j) + " vs " + rounds.get(String.valueOf(i + 1 - totalround)).get(0).get(j));
                }
            }
            System.out.println();
        }
    }
}