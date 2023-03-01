public class Arrays {
    public static void main(String[] args){
        int[] preis = new int[3];
        preis[0] = 2;
        preis[1] = 3;
        preis[2] = 4;
        System.out.println(preis[0]);
        System.out.println(preis[2]);
        System.out.println(preis[0] + preis[1]);
        System.out.println(preis.length);
        System.out.println(java.util.Arrays.toString(preis));
    }
}
// Test