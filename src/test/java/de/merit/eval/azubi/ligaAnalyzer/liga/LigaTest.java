package de.merit.eval.azubi.ligaAnalyzer.liga;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LigaTest {

    @Test
    void ligaAlphabetisch() {

        Liga theLiga = new Liga();
       String text = theLiga.ligaAlphabetisch(1);
       assertTrue(text.contains("1 Liga"));
        System.out.println(text);

    }
}