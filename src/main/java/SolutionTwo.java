

import java.util.Arrays;

public class SolutionTwo {
    public static void main(String[] args) {
        String pin = "1-23";
        System.out.println(validatePin(pin));
    }

    public static boolean validatePin(String pin) {
        StringBuilder sb = new StringBuilder();
        char [] chars = pin.toCharArray();
        for (char c: chars){
            if (Character.isDigit(c) && (chars.length == 4 || chars.length == 6)){
                return true;
            } else if (sb.append(c).toString().isEmpty()){
                return false;
            } else {
                return false;
            }
        } return true;
    }
}
