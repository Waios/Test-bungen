package de.merit.eval.azubi.ligaAnalyzer.domain;

public class Verein {

    private int vereinsId;
    private String name;
    private int liga;

    public Verein(int vereinsId, String name, int liga){

        this.vereinsId = vereinsId;
        this.name = name;
        this.liga = liga;

    }

    public int getVereinsId(){
        return vereinsId;
    }

    public String getName() {
        return name;
    }

    public int getLiga(){
        return liga;
    }
}
