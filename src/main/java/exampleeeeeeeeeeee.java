import java.util.Arrays;

public class exampleeeeeeeeeeee {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int [] ints = new int[]{1,2,3,4,5,6,7,8,9,0};
        String convert = Arrays.toString(ints);
        String output = convert.replaceAll(",", "").replaceAll(" ", "").replaceAll("\\[(.*?)\\]", "$1");
        System.out.println(sb.append("(").append(output.substring(0, 3)).append(")")
                .append(" ").append(output.substring(3, 6)).append("-").append(output.substring(6, 10)).toString());
    }
}
