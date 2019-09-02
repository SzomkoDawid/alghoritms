public class StringCalculator {
    public Integer add(String input) {
        input = input.trim();
        if ("".equals(input)) {
            return 0;
        } input.startsWith("//");

        String[] split = input.split("[\n]");
        if (split.length == 1) {
            return Integer.parseInt(input.trim());
        }
        int sum = 0;
        for(int i = 0; i<split.length; i++){
          String string = split[i];
          int value1 = Integer.parseInt(string.trim());
          sum+=value1;
        }
        return sum;
    }
}
