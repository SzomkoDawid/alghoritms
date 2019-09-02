import java.util.Arrays;

public class createPhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String convert = Arrays.toString(numbers);
        String output = convert.replaceAll(",", "").replaceAll(" ", "").replaceAll("\\[(.*?)\\]", "$1");
        return sb.append("(").append(output.substring(0, 3)).append(")")
                .append(" ").append(output.substring(3, 6)).append("-").append(output.substring(6, 10)).toString();
    }
}