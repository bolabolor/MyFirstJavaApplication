public class Switch {
    public static void main(String[] args) {
        int weekday = 7;
        switch (weekday) {
            case 1 -> System.out.println("Heute gibt es Curry");
            case 2 -> System.out.println("Heute gibt es Hushuurs");
            case 3 -> System.out.println("Heute gibt es Burger");
            case 4 -> System.out.println("Heute gibt es Pizza");
            case 5 -> System.out.println("Heute gibt es Sushi-Bowl");
            default -> System.out.println("Am Wochenende hat die Mensa geschlossen und es gibt nichts zu essen :(");
        }
    }
}
