import fahrzeuge.Auto;
import fahrzeuge.Lkw;
import fahrzeuge.Pkw;

public class ProgrammStart {

    public static void main(String[] args) {
        IO.println("+++ Start Parkhaus Programm +++");

        String parkhausName = IO.readln("Wie heißt das Parkhaus? ");
        IO.println("Willkommen im Parkhaus " + parkhausName);

        int stellplaetze = Integer.parseInt(IO.readln("Wieviele Stellplätze hat das Parkhaus? "));

        Parkhaus parkhaus = new Parkhaus();
        parkhaus.stellplaetze = new Auto[stellplaetze];
        parkhaus.einfahrzeit = new int[stellplaetze];

        parkhaus.ausgabeStellplaetze();

        Auto meinBmw = new Pkw();
        meinBmw.farbe = "schwarz";
        meinBmw.kennzeichen = "K-KK 123";
        meinBmw.marke = "BMW";

        Auto meinFord = new Pkw();
        meinFord.farbe = "schwarz";
        meinFord.kennzeichen = "K-SU 456";
        meinFord.marke = "Ford";

        Auto meinMan = new Lkw();
        meinFord.farbe = "gelb";
        meinFord.kennzeichen = "K-SU 456";
        meinFord.marke = "MAN";

        IO.println("Initiale Belegung frei: "+parkhaus.freieStellplaetze());
        IO.println("Initiale Belegung belegt: "+parkhaus.belegteStellplaetze());
        
        parkhaus.fahrzeugEinfahren(0, meinBmw, 1);
        parkhaus.fahrzeugEinfahren(1, meinFord, 10);
        parkhaus.fahrzeugEinfahren(2, meinMan,50);

        IO.println("Initiale Belegung frei: "+parkhaus.freieStellplaetze());
        IO.println("Initiale Belegung belegt: "+parkhaus.belegteStellplaetze());

        parkhaus.ausgabeStellplaetze();

        // Simulation: BMW verlässt Parkhaus
        parkhaus.fahrzeugAusfahren(0, 100);

        IO.println("+++ Ende Parkhaus Programm +++");
        return;
    }

}