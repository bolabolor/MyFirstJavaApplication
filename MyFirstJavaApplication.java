import java.net.SocketTimeoutException;
import java.util.Arrays;

public class MyFirstJavaApplication {
    public static void main(String[] args){
        int wert1 = 38;
        int wert2 = 36;

        String summe = "Summe:";
        System.out.println("Summe:" + (wert1 + wert2));

        float wert3 = 2.5f;
        float wert4 = 2.8f;
        double wert5 = 3.001;
        double wert6 = 0.009;

        int addition = wert1 + wert2;
        int subtraktion = wert1 - wert2;
        int multiplikation = wert1 * wert2;
        int division = wert1 / 2;
        System.out.println(addition == 74);
        System.out.println(subtraktion != 74);
        System.out.println(multiplikation <= 74);
        System.out.println(division >= 74);
        System.out.println(wert3 == wert4);
        System.out.println(wert5 == wert6);

        System.out.println();

        //Aufgabe 3

        if (wert1 >30) {
            System.out.println("Der Wert ist größer.");
        }
        else {System.out.println("Der Wert ist kleiner.");
        }

        if (subtraktion >40) {
            System.out.println("Der Wert der Subtraktion ist größer.");
        }
        else {System.out.println("Der Wert der Subtraktion ist kleiner.");
        }

        if (addition >40) {
            System.out.println("Der Wert der Addition ist größer.");
        }
        else {System.out.println("Der Wert der Addition ist kleiner.");
        }

        if (division >40) {
            System.out.println("Der Wert der Division ist größer.");
        }
        else {System.out.println("Der Wert der Division ist kleiner.");
        }


// Aufgabe 4
        int[] preis = new int[3];
        preis[0] = 2;
        preis[1] = 3;
        preis[2] = 4;
        System.out.println(preis[0]);
        System.out.println(preis[2]);
        System.out.println(preis[0] + preis[1]);
        System.out.println(preis.length);
        System.out.println(Arrays.toString(preis));



    }}