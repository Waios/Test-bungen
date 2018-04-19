package de.merit.eval.azubi.ligaAnalyzer.liga;

import de.merit.eval.azubi.ligaAnalyzer.domain.Spiel;
import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpielBegegnungTest {

    @Test
    void begegnungsTest() {

        SpielBegegnung theSpiele = new SpielBegegnung();
        List<Spiel> spiele = theSpiele.spieleZumVerein("VfB Stuttgart");
        assertNotNull(spiele);
        assertEquals(34, spiele.size());

        List<Spiel> spiele1 = theSpiele.spieleZumVerein("gibt es nicht");
        assertNotNull(spiele1);
        assertEquals(0, spiele1.size());

    }

    @Test
    void heimSpielToreTest() {

        SpielBegegnung theSpiele = new SpielBegegnung();
        int alleTore = theSpiele.heimToreMannschaft("VfB Stuttgart");
        assertEquals(13, theSpiele.heimToreMannschaft("VfB Stuttgart"));

    }

    @Test
    void auswaertsSpielToreTest() {

        SpielBegegnung theSpiele = new SpielBegegnung();
        int alleTore = theSpiele.auswaertsToreMannschaft(("FC Bayern München"));
        assertEquals(30, theSpiele.auswaertsToreMannschaft("FC Bayern München"));
    }

    @Test
    void vereinsSiegeTest() {

        SpielBegegnung theSpiele = new SpielBegegnung();
        int alleSiege = theSpiele.alleSiegeDesVereins("VfB Stuttgart");
        assertEquals(11, theSpiele.alleSiegeDesVereins("VfB Stuttgart"));
    }

    @Test
    void alleToreDerVereineInLiga() {

        SpielBegegnung theSpiele = new SpielBegegnung();
        Pair<String,Integer>[]  alleToreListeSortiert = theSpiele.alleToreProVereinInLiga(1);
        assertNotNull(alleToreListeSortiert);
        //Pair<String, Integer>[] alleTore = theSpiele.alleToreProVereinInLiga(1);
        //assertEquals(76, theSpiele.alleToreProVereinInLiga(1));

    }
}