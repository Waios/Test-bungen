package de.merit.eval.azubi.ligaAnalyzer.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpielerTest {

    @Test
    public void spielerTest() {

        Spieler testSpieler = new Spieler(1, 3, 10, "Robben", "Niederlande", 17, 5 , 3);
        assertNotNull(testSpieler);
        assertEquals(1, testSpieler.getSpielerId());
        assertEquals("Robben", testSpieler.getSpielerName());


    }
}