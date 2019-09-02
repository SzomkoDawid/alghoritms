

public class Solution {
    public static void main(String[] args) {
        String string = "The new project";
        System.out.print(camelCase(string));
    }

    public static String camelCase(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = string.trim().split("\\s+");
        for (int i = 0; i < strings.length; i++) {
            if (string.isEmpty()){
                return "";
            }
            char toUpperCase = strings[i].toUpperCase().charAt(0);
            String restOfString = strings[i].substring(1, strings[i].length());
            stringBuilder.append(toUpperCase).append(restOfString).toString();
        }
        return stringBuilder.toString();
    }
}

