import java.util.Arrays;

public class testtt {
    public static void main(String[] args) {
        String sentence = "This is another test";
        String array [] = sentence.split("\\s");
        for (String s: array){
            if (s.length() >= 5){
                StringBuilder stringBuilder = new StringBuilder(s);
                System.out.println(stringBuilder.reverse().toString());
            } else {
                System.out.println(s);
            }
        }
    }
}
