package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {



    @Test
    public void csvReaderReadTest() throws IOException {

        List<String[]> list = CSVReader.readLine("bundesliga_Spiel_Test.csv");
        assertNotNull(list);
        assertEquals(11,list.size());
    }

}