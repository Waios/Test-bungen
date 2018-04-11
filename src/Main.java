import javafx.util.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        items.put("G", 70);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        Iterator it = items.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            //it.remove(); // avoids a ConcurrentModificationException
        }


        for (int i = 1; i <= 5; ++i) {

            System.out.println("Outer loop iteration " + i);

            for (int j = 1; j <= 2; ++j) {
                System.out.println("Inner loop i = " + i + "; j = " + j);
            }
        }


        int i = 1;
        while (i <= 5) {
            System.out.println("Outer loop iteration " + i);
            int j = 1;

            while (j <= 2) {
                System.out.println("Inner loop i = " + i + "; j = " + j);
                j++;

            }
            i++;
        }


        int x = 1;

        do {
            System.out.println("Outer loop iteration " + x);

            int y = 1;
            do {
                System.out.println("Inner loop x = " + x + "; y = " + y);
                y++;
            } while (y <= 2);

            x++;
        } while (x <= 5);


        List<Integer> theIntList = new ArrayList<Integer>();

        theIntList.add(120);
        theIntList.add(140);
        theIntList.add(160);
        theIntList.add(180);
        theIntList.add(200);

        for (Integer q : theIntList) {
            System.out.println(q);
        }

        List<String> names = new ArrayList<String>();

        names.add("Michael");
        names.add("Christiane");
        names.add("Emily");
        names.add("Waios");
        names.add("Carlotta");

        for (String n : names) {
            System.out.println(n);
        }

        List<Pair> name = new ArrayList<Pair>();


        name.add(new Pair(1024, "Michael"));
        name.add(new Pair(2048, "Christiane"));
        name.add(new Pair(4096, "Emily"));
        name.add(new Pair(8192, "Waios"));
        name.add(new Pair(0000, "Carlotta"));


        for (Pair m : name) {
            System.out.println(name);

        }

        Map<String, Integer> friends = new HashMap<>();

        friends.put("Marios", 24);
        friends.put("Dean", 24);
        friends.put("Max", 24);
        friends.put("Sotirios", 21);
        friends.put("Ferhat", 27);

        for (Map.Entry<String, Integer> entry : friends.entrySet()) {
            System.out.println("Name : " + entry.getKey() + ", " + " Alter : " + entry.getValue());
        }


        String aktuellerVerein = "";

        List<Pair<String, String>> spielerList = new ArrayList<Pair<String, String>>();

        spielerList.add(new Pair("FC Bayern München", "Franck Ribery"));
        spielerList.add(new Pair("FC Bayern München", "Robert Lewandowski"));
        spielerList.add(new Pair("FC Bayern München", "Thiago Alcantara"));
        spielerList.add(new Pair("Borussia Dortmund", "Christian Pulisic"));
        spielerList.add(new Pair("Borussia Dortmund", "Sokratis Papastathopoulos"));
        spielerList.add(new Pair("Borussia Dortmund", "Marco Reus"));
        spielerList.add(new Pair("Bayer Leverkusen", "Kevin Volland"));
        spielerList.add(new Pair("Bayer Leverkusen", "Panagiotis Retsos"));
        spielerList.add(new Pair("Bayer Leverkusen", "Julian Brandt"));
        spielerList.add(new Pair("VfB Stuttgart", "Timo Baumgartl"));
        spielerList.add(new Pair("FC Bayern München", "Manuel Neuer"));
        spielerList.add(new Pair("FC Barcelona", "Lionel Messi"));


        spielerList.sort(Comparator.comparing(Pair::getValue));
        spielerList.sort(Comparator.comparing(Pair::getKey));

        for (Pair<String, String> aktuellerSpieler : spielerList) {

            if (aktuellerVerein.equals(aktuellerSpieler.getKey())) {
                System.out.println("    " + aktuellerSpieler.getValue());
            } else {
                aktuellerVerein = aktuellerSpieler.getKey();
                System.out.println(aktuellerVerein);
                System.out.println("    " + aktuellerSpieler.getValue());
            }

        }


        List<FussballSpieler> fussballSpielerList = new ArrayList<>();

        fussballSpielerList.add(new FussballSpieler("FC Bayern München", "Franck", "Ribery", 10000000, "linkes Mittelfeld", 7));
        fussballSpielerList.add(new FussballSpieler("Barcelona", "Lionel", "Messi", 40000000, "Sturm", 10));
        fussballSpielerList.add(new FussballSpieler("Real Madrid", "Cristiano", "Ronaldo", 30000000, "Sturm", 7));
        fussballSpielerList.add(new FussballSpieler("FC Bayern München", "Arjen", "Robben", 8000000, "rechtes Mittelfeld", 10));
        fussballSpielerList.add(new FussballSpieler("Paris St.Germain ", "Junior", "Neymar", 25000000, "Sturm", 10));
        fussballSpielerList.add(new FussballSpieler("Vfb Stuttgart", "Timo", "Baumgartl", 1500000, "Abwehr", 5));
        fussballSpielerList.add(new FussballSpieler("Borussia Dortmund", "Mario", "Götze", 9000000, "offensives Mittelfeld", 10));
        fussballSpielerList.add(new FussballSpieler("Olympiakos Piräus", "Konstantinos", "Fortounis", 1700000, "offensives Mittelfeld", 7));
        fussballSpielerList.add(new FussballSpieler("Chelsea London", "Eden", "Hazard", 12000000, "linkes Mittelfeld", 10));
        fussballSpielerList.add(new FussballSpieler("Arsenal London", "Mesut", "Özil", 15000000, "offensives Mittelfeld", 11));
        fussballSpielerList.add(new FussballSpieler("Barcelona", "Gerard", "Pique", 9000000, "Abwehr", 5));
        fussballSpielerList.add(new FussballSpieler("Real Madrid", "Sergio", "Ramos", 11000000, "Abwehr", 4));
        fussballSpielerList.add(new FussballSpieler("Hamburger SV", "Aaron", "Hunt", 3000000, "offensives Mittelfeld", 14));

        //fussballSpielerList.sort(Comparator.comparing(FussballSpieler::getVerein));
        //fussballSpielerList.sort(Comparator.comparing(FussballSpieler::getName));
        fussballSpielerList.sort(Comparator.comparing(FussballSpieler::getGehalt).reversed());


        for (FussballSpieler aktuellerSpieler : fussballSpielerList) {

            //System.out.print(aktuellerSpieler.getPosition() + "  " + aktuellerSpieler.getGehalt() + "  ");
            System.out.println(" Verein: " + aktuellerSpieler.getVerein() + ", " + "Name: " + aktuellerSpieler.getName() +
                    ", " + " Gehalt: " + aktuellerSpieler.getGehalt() + "€" +  ", " + "Position: "
                    + aktuellerSpieler.getPosition() + ", " + "Trikotnummer: " + aktuellerSpieler.getTrikotnummer());
        }

    }
}


