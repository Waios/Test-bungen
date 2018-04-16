package de.merit.eval.azubi.ligaAnalyzer.liga;

import de.merit.eval.azubi.ligaAnalyzer.csvInput.SpielerCSVReader;
import de.merit.eval.azubi.ligaAnalyzer.csvInput.VereinCSVReader;
import de.merit.eval.azubi.ligaAnalyzer.domain.Spieler;
import de.merit.eval.azubi.ligaAnalyzer.domain.Verein;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Liga {


    public String ligaAlphabetisch(int liga) {
        StringBuffer returnString = new StringBuffer();
        returnString.append(liga + " Liga \n");

        VereinCSVReader vereineReader = new VereinCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/main/resources/bundesliga_Verein.csv");

        SpielerCSVReader spielerReader = new SpielerCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/main/resources/bundesliga_Spieler.csv");

        List<Verein> ligaVereine = new ArrayList<>();
        for (Verein currentVerein : vereineReader.loadVereine()) {
            if (currentVerein.getLiga() == liga) {
                ligaVereine.add(currentVerein);
            }
        }

        ligaVereine.sort(Comparator.comparing(Verein::getName));

        for(Verein currentLigaVerein : ligaVereine){
           returnString.append("    " + currentLigaVerein.getName() + "\n");
           List<Spieler> vereinsSpieler = new ArrayList<>();
           for(Spieler currentSpieler : spielerReader.loadSpieler()){
               if(currentLigaVerein.getVereinsId() == currentSpieler.getVereinsId()){
                   vereinsSpieler.add(currentSpieler);
               }

           }

           vereinsSpieler.sort(Comparator.comparing(Spieler::getSpielerName));
           for(Spieler currentSpieler : vereinsSpieler){
               returnString.append("        " + currentSpieler.getSpielerName() + "\n");
           }
        }


        return returnString.toString();
    }

    //wenn eine 1 ausgegeben wird sollen alle Mannschaften der Liga 1 übergeben werden
    //und alle Spieler der Liga 1 alphabetisch sortiert

    /*
    1 Liga
        A Mannschaft
            A Spieler
            B Spieler
            ...
        B Mannschaft
            ...
     */




}
