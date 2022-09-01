package createfixture;

import java.util.*;

public class fixture {

    public static void main(String[] args) {
        System.out.println("TAKIM SAYISI G�R�N�Z:");
        int tak�msay�s�;

        Scanner input = new Scanner(System.in);
        tak�msay�s� = input.nextInt();

        List<String> tak�mlar�listele = new ArrayList<>();

        for (int i = 0; i < tak�msay�s�; i++) {
            System.out.println("Tak�m ismi Giriniz:");
            String tak�mismi = input.next();
            tak�mlar�listele.add(tak�mismi);
        }

        if (tak�msay�s� % 2 != 0) {
            tak�mlar�listele.add("BAY");
            tak�msay�s� += 1;
        }

        Iterator<String> itr = tak�mlar�listele.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List<String> ge�icitak�mlar�listele = new ArrayList<>();

        for (int i = 0; i < tak�msay�s�; i++) {
            int index = (int) (Math.random() * tak�mlar�listele.size());
            tak�mlar�listele.add(tak�mlar�listele.get(index));
            tak�mlar�listele.remove(tak�mlar�listele.get(index));
        }

        ge�icitak�mlar�listele = tak�mlar�listele;

        System.out.println("***********");

        Iterator<String> itr2 = ge�icitak�mlar�listele.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        int totalround = tak�msay�s� - 1;
        int numMatchperround = tak�msay�s� / 2;

        LinkedHashMap<String, ArrayList<ArrayList<String>>> rounds = new LinkedHashMap<>();

        for (int i = 0; i < totalround; i++) {
            String round = String.valueOf(i + 1);
            rounds.put(round, new ArrayList<ArrayList<String>>());
        }

        for (int i = 0; i < totalround; i++) {
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();
            for (int j = 0; j < numMatchperround; j++) {
                home.add(tak�mlar�listele.get(j));
                away.add(tak�mlar�listele.get((tak�msay�s� - 1) - j));  //(tak�msay�s�-1)-j index of away team
            }

            String round = String.valueOf(i + 1);
            rounds.get(round).add(home);
            rounds.get(round).add(away);

            List<String> newTeams = new ArrayList<>();

            newTeams.add(tak�mlar�listele.get(0));
            newTeams.add(tak�mlar�listele.get(tak�msay�s� - 1));

            for (int k = 0; k < tak�mlar�listele.size(); k++) {
                newTeams.add(tak�mlar�listele.get(k));
            }

            tak�mlar�listele = newTeams;
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