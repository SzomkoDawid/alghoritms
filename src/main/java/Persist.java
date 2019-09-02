

import java.util.Arrays;

public class Persist {
    public static void main(String[] args) {
        long n = 39;
        System.out.println(persistence(n));
    }
    public static int persistence(long n) {
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        String string = Long.toString(n);
        String[] array = string.split("");
        for (int i = 0; i <= array.length; i++) {
            int[] ints = Arrays.asList(array).stream().mapToInt(Integer::parseInt).toArray();
            sum = Arrays.stream(ints).sum();
            String string1 = Integer.toString(sum);
            String [] arrayTwo = string1.split("");
            int [] ints1 = Arrays.asList(arrayTwo).stream().mapToInt(Integer::parseInt).toArray();
            sum2 = Arrays.stream(ints1).sum();
            String string2 = Integer.toString(sum2);
            String [] arrayThree = string2.split("");
            int [] ints2 = Arrays.asList(arrayThree).stream().mapToInt(Integer::parseInt).toArray();
            sum3 = Arrays.stream(ints2).sum();
            if (sum3 <= 9){
                return sum3;
            } else if (sum2 < 20 && sum2 > 9 ){
                return sum2;
            } else {
                return sum;
            }
        }
        return sum;
    }
}