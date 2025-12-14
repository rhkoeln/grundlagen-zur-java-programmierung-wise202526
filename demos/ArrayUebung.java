public class ArrayUebung {
    public static void main(String[] args) {

        // Anlage Variable und Initialisierung des Array
        // Array mit 100 Plätzen für ganze Zahlen
        int[] zahlenArray = new int[100];

        // Einzelne Plätze im Array befüllen
        zahlenArray[0] = 34;
        zahlenArray[1] = 67789;
        zahlenArray[2] = 23;

        System.out.println("Im Array an Stelle 2 ist: " + zahlenArray[2]);
        System.out.println("Im Array an Stelle 29 ist: " + zahlenArray[29]);

        // Zweites Array mit sofortiger Initialisierung
        int[] zweitesArray = {12,45,78,34,23,89,90};


    }
}
