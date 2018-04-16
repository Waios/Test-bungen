package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import de.merit.eval.azubi.ligaAnalyzer.domain.Verein;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Integer.valueOf;

public class VereinCSVReader {

    private String dateiName;

    public VereinCSVReader(String dateiName) {
        this.dateiName = dateiName;
    }

    public List<Verein> loadVereine() {


        List<Verein> alleVereine = new ArrayList<>();

        List<String[]> resultList = CSVReader.read(dateiName);

        resultList.remove(0);

        for(String[] listElement : resultList){
            Verein theVerein = new Verein(valueOf(listElement[0]), listElement[1], valueOf(listElement[2]));

            alleVereine.add(theVerein);
        }

        return alleVereine;
    }

}
