package fahrzeuge;

public class Auto {

    public String farbe;
    public String marke;
    public String kennzeichen;

    public String toString(){
        String fahrzeugTyp = this.getClass().getName();
        return fahrzeugTyp + " Kennzeichen=" + kennzeichen + " Marke=" + marke + " Farbe="+farbe; 
    }

}
