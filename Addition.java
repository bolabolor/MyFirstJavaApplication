public class Addition {
    public static void main(String[] args){
        int value1 = 10;
        int value2 = 20;
        int value = 99;
        System.out.println(sum(value1, value2));
        System.out.println(isBiggerThanHundred(value));
    }
    public static int sum(int value1, int value2) {
        return value1 + value2;
    }
    public static boolean isBiggerThanHundred(int value) {
        return value > 100;
    }
}
