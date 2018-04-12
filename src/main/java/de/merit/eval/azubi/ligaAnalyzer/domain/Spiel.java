package de.merit.eval.azubi.ligaAnalyzer.domain;

public class Spiel {

    private int spielId;
    private int spieltag;
    private String datum;
    private String uhrzeit;
    private int heim;
    private int gast;
    private int heimTore;
    private int gastTore;


    public Spiel(int spielId, int spieltag, String datum, String uhrzeit, int heim, int gast, int heimTore, int gastTore) {
        this.spielId = spielId;
        this.spieltag = spieltag;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.heim = heim;
        this.gast = gast;
        this.heimTore = heimTore;
        this.gastTore = gastTore;
    }

    public int getSpielId() {
        return spielId;
    }

   public int getSpieltag(){
        return spieltag;
   }

   public String getDatum(){
        return datum;
   }

   public String getUhrzeit(){
        return uhrzeit;
   }

   public int getHeim(){
        return heim;
   }

   public int getGast(){
        return gast;
   }

   public int getHeimTore(){
        return heimTore;
   }

   public int getGastTore(){
        return gastTore;
   }

}
