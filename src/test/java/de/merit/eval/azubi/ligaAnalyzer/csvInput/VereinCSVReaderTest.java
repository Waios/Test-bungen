package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import de.merit.eval.azubi.ligaAnalyzer.domain.Verein;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VereinCSVReaderTest {

    @Test
    void vereinTest() {

        VereinCSVReader theReader = new VereinCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/test/resources/bundesliga_Verein_Test.csv");
        List<Verein> resultList = theReader.loadVereine();

        assertNotNull(resultList);
        assertEquals(10, resultList.size());

    }
}