package de.merit.eval.azubi.ligaAnalyzer.liga;

import de.merit.eval.azubi.ligaAnalyzer.csvInput.SpielCSVReader;
import de.merit.eval.azubi.ligaAnalyzer.csvInput.VereinCSVReader;
import de.merit.eval.azubi.ligaAnalyzer.domain.Verein;

import java.util.ArrayList;
import java.util.List;

public class SpieleBegegnung {

    private int verinsId;

    public Verein spieleZumVerein(String vereinsName) {


        VereinCSVReader vereineReader = new VereinCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/main/resources/bundesliga_Verein.csv");

        SpielCSVReader spielReader = new SpielCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/main/resources/bundesliga_Spiel.csv");

        List<Verein> ligaVerein = new ArrayList<>();

        Verein foundMannschaft = null;

        for (Verein currentVerein : vereineReader.loadVereine()){
            if(currentVerein.getName().equals(vereinsName)){
                 foundMannschaft = currentVerein;
                 break;
            }
        }
        return foundMannschaft;
    }

    public int getVereinsId() {
        return verinsId;
    }
}
