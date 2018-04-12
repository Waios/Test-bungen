package de.merit.eval.azubi.ligaAnalyzer.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VereinTest {

    @Test
    public void vereinTest() {

        Verein testVerein = new Verein(7, "VfB Stuttgart", 1);
        assertNotNull(testVerein);
        assertEquals("VfB Stuttgart", testVerein.getName());
        assertEquals(1, testVerein.getLiga());
    }

}