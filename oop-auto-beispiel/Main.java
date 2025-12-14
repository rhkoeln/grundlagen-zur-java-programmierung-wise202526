public class HalloKoeln {
    public static void main(String[] args) {
        System.out.println("Beispiel Programm mit Auto");

        // Erstelle ein Auto-Objekt von der Auto-Klasse (Bauplan)
        Auto meinErstesAutoBmw = new Auto("BMW","blau");

        // Setze Attribute des Autos mit Attributwerten

        // Führe eine Methode der Klasse aus
        meinErstesAutoBmw.fahren(10);
        meinErstesAutoBmw.fahren(25);

        // zweites Auto erstellen
        Auto meinZweitesAutoFord = new Auto("Ford","rot");

        meinZweitesAutoFord.fahren(100);
        meinErstesAutoBmw.fahren(5);
        meinErstesAutoBmw.fahren();

        // drittes Auto erstellen
        Auto drittesAuto = new Auto("Audi", "schwarz");
        drittesAuto.fahren(10);

        Auto viertesAuto = new Auto("Mercedes", "weiß", 250);
        viertesAuto.fahren(50);

        viertesAuto.aktuellerKmStand();

        // geht nicht, da kmStand private ist
        // System.out.println("Der KmStand: " + viertesAuto.kmStand);

        // funktionert
        System.out.println("Der KmStand: " + viertesAuto.aktuellerKmStand());
        
        //viertesAuto.berechnungPsZuKw(250);
    }
}