package de.merit.eval.azubi.ligaAnalyzer.liga;

import de.merit.eval.azubi.ligaAnalyzer.domain.Verein;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpieleBegegnungTest {
    @Test
    void begegnungsTest() {

        SpieleBegegnung theSpiele = new SpieleBegegnung();
        Verein spiel = theSpiele.spieleZumVerein("VfB Stuttgart");
        assertEquals(8,theSpiele.getVereinsId());


    }
}