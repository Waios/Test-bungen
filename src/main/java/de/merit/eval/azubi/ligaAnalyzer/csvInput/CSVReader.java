package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {  //Klasse; sie dient zum einlesen von CSV Dateiene die sich im src/main/java/resources Ordner befinden


    public static List<String[]> read(String csvFile) {  // oeffentliche Klassenmethode (static) Rückgabe eine Liste mit String Array
                                                         // im Array befinden sich die einzelnen Strings einer Zeile
                                                         // Parameter: csvFile -> Dateiname mit Pfad der Datei die gelesen werden soll

        // Definitionen
        BufferedReader br = null;                       // Lesepuffer fuer die Eingabezeilen
        List<String[]> resultList = new ArrayList();    // Ergebnis Liste mit String Array[]
        String line = "";                               // def Varible fuer eine Zeile
        String cvsSplitBy = ";";                        // def des Trennzeichens

        try {                                           // try catch Block falls bei den Datei Operationen ein Fehler auftritt

            br = new BufferedReader(new FileReader(csvFile));     // in br wird ein neuer BufferedReader gespeicher , welcher mit
                                                                  // einem neuen FileReader initialisiert wird. Der FileReader bekommt
                                                                  // die Variable csvFile in der der Dateiname steht übergeben.

            while ((line = br.readLine()) != null) {    // Schleife: solange der br eine Zeile liefert wird diese in der Variable line gespeichert

                // use semicolon as separator
                String[] words = line.split(cvsSplitBy);    // der Inhalt der Variablen line wird an den Trennzeichen (am Semikolon)
                                                            // aufgesplittet und in der Variablen words als Array gespeichert
                resultList.add(words);                      // das Array mit den Woertern wird der Ergebnis Liste hinzugefügt

            }
        // Fehlerbehandlung
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return resultList; //Rückgabe der Liste mit den Wort Arrays

    }
}