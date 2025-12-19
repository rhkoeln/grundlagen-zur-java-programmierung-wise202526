import fahrzeuge.Auto;

public class Parkhaus {

    public Auto[] stellplaetze;
    public int[] einfahrzeit;

    /**
     * Gib über Konsole alle Stellplätze und ggf. geparktes Auto aus
     */
    public void ausgabeStellplaetze(){
        for(int i=0; i<stellplaetze.length; i++){
            System.out.println("Stellplatz " + (i+1) + ": " + stellplaetze[i]);
        }
    }

    /**
     * Berechne die Anzahl der freien Stellplaetze
     * @return freie Stellplätze
     */
    public int freieStellplaetze(){
        int freieStellplaetze = 0;
        for(int i=0; i<stellplaetze.length; i++){
            if(stellplaetze[i] == null){
                freieStellplaetze = freieStellplaetze + 1;
            }
        }
        return freieStellplaetze;
    }

    /**
     * Berechne die Anzahl der belegten Stellplaetze
     * @return belegte Stellplaetze
     */
    public int belegteStellplaetze(){
        return stellplaetze.length - freieStellplaetze();
    }

    /**
     * Neues Auto in Parkhaus einfahren
     * @param stellplatz
     * @param auto
     * @param zeit
     */
    public void fahrzeugEinfahren(int stellplatz, Auto auto, int zeit){
        stellplaetze[stellplatz] = auto;
        einfahrzeit[stellplatz] = zeit;
        System.out.println("-> Fahrzeug fährt ein: " + auto);
    }

    /**
     * Fahrzeug verlässt Parkhaus
     * @param stellplatz
     * @param zeit
     */
    public void fahrzeugAusfahren(int stellplatz, int ausfahrzeit){
        int parkdauer = ausfahrzeit - einfahrzeit[stellplatz];
        System.out.println("<- Fahrzeug fährt aus: " + stellplaetze[stellplatz] + " Parkdauer: "+ parkdauer);
        stellplaetze[stellplatz] = null;
        einfahrzeit[stellplatz] = 0;
    }

}
