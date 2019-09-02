public class example {
    public static void main(String[] args) {
        encryptThis("The first something");
    }

    public static void encryptThis(String text) {
        String output = "";
        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            char end = strings[i].charAt(strings[i].length() - 1);
            char start = strings[i].charAt(1);
            if (strings[i].length() == 1) {
                System.out.println(stringBuilder.append(((int) strings[i].charAt(0))).append(" ").toString());
            } else if (strings[i].length() == 2) {
                System.out.println(stringBuilder.append(((int) strings[i].charAt(0))).append(start).append(" ").toString());
            } else {
                System.out.println(stringBuilder.append(((int) strings[i].charAt(0)))
                        .append(end).append(strings[i].substring(2, strings[i].length()-1)).append(start).append(" ").toString());
            }
        }
    }
}

