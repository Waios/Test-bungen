package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import de.merit.eval.azubi.ligaAnalyzer.domain.Spieler;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class SpielerCSVReader {

    private String dateiName;

    public SpielerCSVReader(String dateiName) {
        this.dateiName = dateiName;
    }

    public List<Spieler> loadSpieler(){



        List<Spieler> alleSpieler = new ArrayList<>();

        List<String[]> resultList = CSVReader.read(dateiName);

        resultList.remove(0);

        for(String[] listElement : resultList){

            Spieler theSpieler = new Spieler(valueOf(listElement[0]), valueOf(listElement[1]), valueOf(listElement[2]), listElement[3], listElement[4], valueOf(listElement[5]),
                    valueOf(listElement[6]), valueOf(listElement[7]));

            alleSpieler.add(theSpieler);
        }

        return alleSpieler;

    }


}
