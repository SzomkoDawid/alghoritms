

public class TripleDouble {
    public static void main(String[] args) {
        long num1 = 451999277;
        long num2 = 411777228;
        System.out.println(TripleDouble(num1, num2));
    }

    public static int TripleDouble(long num1, long num2) {
        String first = Long.toString(num1);
        String second = Long.toString(num2);
        if (num1 == num2);
        for (int i = 0; i < first.length() - 1; i++) {
            if (first.charAt(i) == first.charAt(i + 1) &&
                    first.charAt(i + 1) == first.charAt(i + 2) &&
                    first.charAt(i + 2) > first.length()) {
                if (first.lastIndexOf(first) >= 0){
                    break;
                }
                return 1;
            }
            for (int j = 0; j < second.length() - 1; j++) {
                if (second.charAt(j) == second.charAt(j + 1) &&
                        second.charAt(j + 1) > second.length()) {
                    if (second.lastIndexOf(first) >= 0){
                        break;
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}