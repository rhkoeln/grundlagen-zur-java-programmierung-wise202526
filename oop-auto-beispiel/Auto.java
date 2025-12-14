/**
 * Eine Beispielklasse, die den Bauplan eines Autos beschreibt.
 * Hier können noch weitere Attribute und Methoden ergänzt werden.
 * ToDo: Methoden ergänzen, z.B. fahren(), bremsen(), hupen()
 * 
 * @author Philipp
 * @version 0.1-aplha
 */
public class Auto {

    // ps sind Leistung in Pferdestärken
    private int ps;

    // kmStand ist der Kilometerstand des Autos
    private int kmStand = 0;

    // marke ist die Automarke, z.B. "BMW"
    private String marke;
    
    // farbe ist die Farbe des Autos, z.B. "rot"
    private String farbe;


    public Auto(String markeParam, String farbeParam){
        System.out.println("Ein neues Auto der Marke " + markeParam + " in der Farbe " + farbeParam + " wurde erstellt!");
        this.marke = markeParam;
        this.farbe = farbeParam;        
    }

    public Auto(String markeParam, String farbeParam, int psParam){
        System.out.println("Ein neues Auto der Marke " + markeParam + " in der Farbe " + farbeParam + " wurde erstellt!");
        this.marke = markeParam;
        this.farbe = farbeParam;        
        this.ps = psParam;
    }

    /**
     * Methode, die das Auto fahren lässt.
     * @param entfernungKm Die Entfernung in Kilometern, die das Auto fahren soll.
     */
    public void fahren(int entfernungKm) {
        kmStand = kmStand + entfernungKm;
        int kwLeistung = berechnungPsZuKw(ps);
        System.out.println("Das Auto vom Typ " + marke + " mit einer Leistung von " + ps + "PS (" + kwLeistung + "kW). Der neue Kilometerstand ist: " + kmStand);
    }

    /**
     * Methode, die das Auto per Default 10km fahren lässt.
     * Dies ist eine Überladung der fahren-Methode von oben.
     */
    public void fahren() {
        kmStand = kmStand + 10;
        System.out.println("Das Auto vom Typ " + marke + " fährt. Der neue Kilometerstand ist: " + kmStand);
    }

    /**
     * Gibt den aktuellen Kilometerstand des Autos zurück.
     * @return aktueller KM-Stand
     */
    public int aktuellerKmStand() {
        return kmStand;
    }

    private int berechnungPsZuKw(int ps) {
        return (int)(ps * 0.7355);
    }

}