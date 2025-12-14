public class ForSchleife {
    public static void main(String[] args) {

        long summe = 1;
        int anzahl = 20;
        long[] werteArray = new long[20];

        // for Schleife Multiplikation
        for (int iteration = 1; iteration <= anzahl; iteration++) {
            summe = summe * iteration;
            werteArray[iteration-1] = summe;
            // System.out.println("Ich multipliziere " + iteration + ". Neue Summe: " + summe);
        }
        System.out.println("Die Summe der Zahlen von 1 bis " + anzahl + " ist: " + summe);

        for (long wert : werteArray) {
            System.out.println("Wert im Array: " + wert);
        }
 
    }
}
