
public class MaxRotate {
    public static void main(String[] args) {
        long n = 56789;
        System.out.println(maxRot(n));
    }
    public static long maxRot(long n) {
        String convert = Long.toString(n);
        for (int i = 0; i < convert.length() - 1; i++){
            convert = convert.substring(0, i) + convert.substring(i + 1) + convert.charAt(i);
        } if (Long.parseLong(convert) > n) {
            n = Long.parseLong(convert);
        } return n;
    }
}