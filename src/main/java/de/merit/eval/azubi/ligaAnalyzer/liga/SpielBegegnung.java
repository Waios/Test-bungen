package de.merit.eval.azubi.ligaAnalyzer.liga;

import de.merit.eval.azubi.ligaAnalyzer.csvInput.SpielCSVReader;
import de.merit.eval.azubi.ligaAnalyzer.csvInput.VereinCSVReader;
import de.merit.eval.azubi.ligaAnalyzer.domain.Spiel;
import de.merit.eval.azubi.ligaAnalyzer.domain.Verein;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class SpielBegegnung {

    private VereinCSVReader vereineReader = new VereinCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/main/resources/bundesliga_Verein.csv");

    private SpielCSVReader spielReader = new SpielCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/main/resources/bundesliga_Spiel.csv");

    public List<Spiel> spieleZumVerein(String vereinsName) {


        Verein foundMannschaft = getVerein(vereinsName);


        List<Spiel> ligaVerein = new ArrayList<>();

        if (foundMannschaft != null) {


            for (Spiel currentSpiel : spielReader.loadSpiele()) {
                if (currentSpiel.getHeim() == foundMannschaft.getVereinsId() || currentSpiel.getGast() == foundMannschaft.getVereinsId()) {
                    ligaVerein.add(currentSpiel);
                }
            }

        }
        return ligaVerein;
    }

    private Verein getVerein(String vereinsName) {
        Verein foundMannschaft = null;

        for (Verein currentVerein : vereineReader.loadVereine()) {
            if (currentVerein.getName().equals(vereinsName)) {
                foundMannschaft = currentVerein;
                break;
            }

        }
        return foundMannschaft;
    }

    public int heimToreMannschaft(String vereinsName) {

        int alleTore = 0;

        Verein derVerein = getVerein(vereinsName);
        for (Spiel currentSpiel : spieleZumVerein(vereinsName)) {
            if (currentSpiel.getHeim() == derVerein.getVereinsId()) {
                alleTore = alleTore + currentSpiel.getHeimTore();
            }
        }
        return alleTore;


    }

    public int auswaertsToreMannschaft(String vereinsName) {

        int alleTore = 0;

        Verein derVerein = getVerein(vereinsName);
        for (Spiel currentSpiel : spieleZumVerein(vereinsName)) {
            if (currentSpiel.getGast() == derVerein.getVereinsId()) {
                alleTore = alleTore + currentSpiel.getGastTore();
            }
        }
        return alleTore;
    }

    public int alleSiegeDesVereins(String vereinsName) {

        int siege = 0;
        Verein derVerein = getVerein(vereinsName);

        for (Spiel currentSpiel : spieleZumVerein(vereinsName)) {
            if (currentSpiel.getHeimTore() == currentSpiel.getGastTore()) {
                //Unentschieden
            } else if (currentSpiel.getHeimTore() > currentSpiel.getGastTore()) {
                if (currentSpiel.getHeim() == derVerein.getVereinsId()) {
                    siege++;
                }
            } else if (currentSpiel.getGastTore() > currentSpiel.getHeimTore()) {
                if (currentSpiel.getGast() == derVerein.getVereinsId()) {
                    siege++;
                }
            } else {
                throw new InvalidParameterException("Wie kann das sein?");
            }
        }
        return siege;
    }


    public String[][] alleToreProVereinInLiga(int liga) {

        int[][] allErgebnisse = new int[18][2];

        int x = 0;

        for (Verein currentVerein : vereineReader.loadVereine()) {
            if (currentVerein.getLiga() == liga) {

                allErgebnisse[x++][0] = (currentVerein.getVereinsId());
            }
        }


        for (int y = 0; y < allErgebnisse.length; y++) {


            int alleTore = 0;

            for (Spiel aktuellesSpiel : spielReader.loadSpiele()) {
                if (aktuellesSpiel.getHeim() == allErgebnisse[y][0]) {
                    alleTore = alleTore + aktuellesSpiel.getHeimTore();

                } else if (aktuellesSpiel.getGast() == allErgebnisse[y][0]) {
                    alleTore = alleTore + aktuellesSpiel.getGastTore();
                }
            }
            allErgebnisse[y][1] = alleTore;
        }


        //
        String[][] allToreProMannschaft = new String[18][2];
        for (int z = 0; z < allErgebnisse.length; z++) {

            for (Verein currentVerein : vereineReader.loadVereine())
                if (currentVerein.getVereinsId() == allErgebnisse[z][0]) {
                    allToreProMannschaft[z][0] = (currentVerein.getName());
                    allToreProMannschaft[z][1] = (Integer.toString(allErgebnisse[z][1]));

                }
        }


        return allToreProMannschaft;
    }

}