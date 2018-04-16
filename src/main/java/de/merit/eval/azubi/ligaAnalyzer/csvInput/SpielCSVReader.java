package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import de.merit.eval.azubi.ligaAnalyzer.domain.Spiel;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Integer.valueOf;

public class SpielCSVReader {

    private String dateiName;

    public SpielCSVReader(String dateiName) {
        this.dateiName = dateiName;
    }

    public List<Spiel> loadSpiele(){



        List<Spiel> alleSpiele = new ArrayList<>();

        //datei mit csvReader laden
        List<String[]> resultList = CSVReader.read(dateiName);

        //erste zeile im array überspringen alle weiteren zeilen(array) in ein objekt transferieren
        resultList.remove(0);
        for( String[] listElement : resultList) {
            Spiel theSpiel = new Spiel(valueOf(listElement[0]), valueOf(listElement[1]), listElement[2], listElement[3], valueOf(listElement[4]), valueOf(listElement[5]),
                    valueOf(listElement[6]), valueOf(listElement[7]));

            //neues objektd der ergebnisliste hinzufügen
            alleSpiele.add(theSpiel);
        }

        //gefüllte ergebnisliste zurückgeben
        return alleSpiele;

    }

}
