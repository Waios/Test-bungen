package de.merit.eval.azubi.ligaAnalyzer.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpielTest {


    @Test
    public void spielTest() {

        Spiel testSpiel = new Spiel(1,5,"12.12.12", "20:30", 2,3,2,1);
        assertNotNull(testSpiel);
        assertEquals("12.12.12", testSpiel.getDatum());
    }

}