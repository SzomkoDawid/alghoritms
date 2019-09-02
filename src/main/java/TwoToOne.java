
import java.util.Arrays;
public class TwoToOne {
    public static void main(String[] args) {
        String a = "lordsofthefallen";
        String b = "gamekult";
        System.out.println(longest(a, b));
    }
    public static String longest(String a, String b) {
        String c = a.concat(b);
        String result = "";
        for (int i = 0; i < c.length(); i++){
            if (!result.contains(String.valueOf(c.charAt(i)))){
                result += String.valueOf(c.charAt(i));
            }
        }  char [] sorted = result.toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }
}