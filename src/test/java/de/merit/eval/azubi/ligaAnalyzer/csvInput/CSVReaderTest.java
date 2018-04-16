package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {


    @Test
    void CSVReaderTest() {

        List<String[]> resultList = CSVReader.read("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/test/resources/bundesliga_Verein_Test.csv");
        assertNotNull(resultList);
        assertEquals(11, resultList.size());
        for(String[] listElement : resultList){

                System.out.println(listElement[0] + " " + listElement[1] + " " + listElement[2]);

        }


        List<String[]> resultList1 = CSVReader.read("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/test/resources/bundesliga_Spieler_Test.csv");
        assertNotNull(resultList1);
        assertEquals(11, resultList1.size());

        for( String[] listElement : resultList1){

            System.out.println(listElement[0] + " " + listElement[1] + " " + listElement[2] + " " + listElement[3] + " " + listElement[4] + " " + listElement[5]
                    + " " + listElement[6] + " " + listElement[7]);
        }




        List<String[]> resultList2 = CSVReader.read("/home/mruppert/develop/merit-eval/azubi/TestÜbungen/src/test/resources/bundesliga_Spiel_Test.csv");
        assertNotNull(resultList2);
        assertEquals(11, resultList2.size());

        for( String[] listElement : resultList2){

            System.out.println(listElement[0] + " " + listElement[1] + " " + listElement[2] + " " + listElement[3] + " " + listElement[4] + " " + listElement[5]
                    + " " + listElement[6] + " " + listElement[7]);
        }


    }
}