package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import de.merit.eval.azubi.ligaAnalyzer.domain.Spieler;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpielerCSVReaderTest {

    @Test
    void spielerTest() {

        SpielerCSVReader theReader = new SpielerCSVReader("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/test/resources/bundesliga_Spieler_Test.csv");
        List<Spieler> resultList = theReader.loadSpieler();

        assertNotNull(resultList);
        assertEquals(10, resultList.size());

    }
}