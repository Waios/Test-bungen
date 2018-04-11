public class FussballSpieler {

    String verein;
    String vorname;
    String name;
    int gehalt;
    String position;
    int trikotnummer;

    public FussballSpieler(String verein, String vorname, String name, int gehalt, String position, int trikotnummer) {
        this.verein = verein;
        this.vorname = vorname;
        this.name = name;
        this.gehalt = gehalt;
        this.position = position;
        this.trikotnummer = trikotnummer;
    }

    public String getVerein() {
        return verein;
    }

    public String getVorname() {
        return vorname;
    }

    public String getName() {
        return name;
    }

    public int getGehalt() {
        return gehalt;
    }

    public String getPosition() {
        return position;
    }

    public int getTrikotnummer() {
        return trikotnummer;
    }

    @Override
    public String toString() {
        return "FussballSpieler{" +
                "verein='" + verein + '\'' +
                ", vorname='" + vorname + '\'' +
                ", name='" + name + '\'' +
                ", gehalt=" + gehalt +
                ", position='" + position + '\'' +
                ", trikotnummer=" + trikotnummer +
                '}';
    }
}
