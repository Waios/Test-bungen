package de.merit.eval.azubi.ligaAnalyzer.domain;

public class Spieler {

    private int spielerId;
    private int vereinsId;
    private int trikotNr;
    private String spielerName;
    private String land;
    private int spiele;
    private int tore;
    private int vorlagen;

    public Spieler(int spielerId, int vereinsId, int trikotNr, String spielerName, String land, int spiele, int tore, int vorlagen ){

        this.spielerId = spielerId;
        this.vereinsId = vereinsId;
        this.trikotNr = trikotNr;
        this. spielerName = spielerName;
        this.land = land;
        this.spiele = spiele;
        this.tore = tore;
        this.vorlagen = vorlagen;

    }

    public int getSpielerId(){
        return spielerId;
    }

    public int getVereinsId(){
        return vereinsId;
    }

    public int getTrikotNr(){
        return trikotNr;
    }

    public String getSpielerName(){
        return spielerName;
    }

    public String getLand(){
        return land;
    }

    public int getSpiele(){
        return spiele;
    }

    public int getTore(){
        return tore;
    }

    public int getVorlagen() {
        return vorlagen;
    }

}
