public class HalloSchleifen {
    public static void main(String[] args) {

        int summe = 0;
        int anzahl = 100;
        int iteration = 1;

        // while Schleife
        while (iteration <= anzahl) {
            summe = summe + iteration;
            System.out.println("Ich addiere " + iteration + ". Neue Summe: " + summe);
            iteration++;
        }
        System.out.println("Die Summe der Zahlen von 1 bis " + anzahl + " ist: " + summe);

    }
}
