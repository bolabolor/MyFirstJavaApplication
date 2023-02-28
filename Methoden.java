public class Methoden {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        System.out.println(sum(value1, value2));
        System.out.println(sum2(value1, value2));
        System.out.println(vergleich(value1, value2));

        String name = "Bola";
        System.out.println(laenge(name));

        String someString = "This sentence contains the word Fancy.";
        System.out.println(enthaelt(someString));
        System.out.println(bothTrue(someString));


    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static String sum2(int value1, int value2) {
        return "Summe: " + (value1 + value2);
    }

    public static boolean vergleich(int value1, int value2) {
        return (value1 | value2) > 100;
    }

    public static boolean laenge(String name) {
        return name.length() > 20;
    }

    public static boolean enthaelt(String someString) {
        return someString.contains("Fancy");
    }
    public static boolean bothTrue(String someString) {
        return (laenge(someString)) && (someString.contains("Fancy"));
    }

}
