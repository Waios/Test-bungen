package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import de.merit.eval.azubi.ligaAnalyzer.domain.Spiel;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpielCSVReaderTest {

    @Test
    void spielTest() {


        SpielCSVReader theReader = new SpielCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/test/resources/bundesliga_Spiel_Test.csv");
        List<Spiel> resultList = theReader.loadSpiele();

        assertNotNull(resultList);
        assertEquals(10, resultList.size());


    }
}