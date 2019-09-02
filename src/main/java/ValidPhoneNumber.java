import java.util.regex.Pattern;

public class Kata6 {
    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(111) 555-2345".trim()));
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty()){
            return false;
        }
        if (phoneNumber.charAt(0) == '(' && phoneNumber.charAt(4) == ')'
                && phoneNumber.substring(1,3).matches("\\d+") && phoneNumber.charAt(5) == ' '
                && phoneNumber.substring(6, 8).matches("\\d+") && phoneNumber.charAt(9) == '-'
                && phoneNumber.substring(10, 13).matches("\\d+")){
            return true;
        } else {
            return false;
        }
    }
}