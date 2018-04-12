package de.merit.eval.azubi.ligaAnalyzer.csvInput;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<String[]> readLine(String dateiname) throws IOException {


        FileReader reader = new FileReader("bundesliga_Spiel_Test.csv");
        BufferedReader inBuffer = new BufferedReader(reader);

        String line = inBuffer.readLine();

        while (line != null) {
            System.out.println(line);
            line = inBuffer.readLine();
        }return (List<String[]>) reader;

    }

}


    /*public static List<String[]> read(String csvFile) {

        BufferedReader br = null;
        List<String[]> resultList = new ArrayList();
        String line = "";
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use semicolon as separator
                String[] words = line.split(cvsSplitBy);
                resultList.add(words);

            }

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
        return resultList;

    }*/