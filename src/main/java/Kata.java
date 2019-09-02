public class Kata{
    public static void main(String[] args) {
        String text = "T less he spoke the more he heard";
        System.out.println(encryptThis(text));
    }
    public static String encryptThis(String text) {
        String output = "";
        String space = " ";
        String[] strings = text.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < 2) {
                output = stringBuilder.append(((int) strings[i].charAt(0))).append(space).toString();
            }
            else if (strings[i].length() == 2) {
                output = stringBuilder.append(((int) strings[i].charAt(0))).append(strings[i].charAt(1)).append(space).toString();
            } else {
                output = stringBuilder.append(((int) strings[i].charAt(0)))
                        .append(strings[i].charAt(strings[i].length() - 1))
                        .append(strings[i].substring(2, strings[i].length() - 1))
                        .append(strings[i].charAt(1)).append(space).toString();
            }
            if (strings[i].length() == 0){
                return "";
            }
        }
        return output.trim();
    }
}

/*     if (strings[i].length() > 4) {
                output = stringBuilder.append(((int) strings[i].charAt(0)))
                        .append(end).append(middle).append(start).append(" ").toString();
            }
            if (strings[i].length() == 4){
                output = stringBuilder.append(((int) strings[i].charAt(0)))
                        .append(end).append(strings[i].charAt(2)).append(start).append(" ").toString();
            }
            if (strings[i].length() == 3){
                output = stringBuilder.append(((int) strings[i].charAt(0)))
                        .append(end).append(start).append(" ").toString();
            } if (strings[i].length() == 2){
                output = stringBuilder.append(((int) strings[i].charAt(0)))
                        .append(end).append(start).toString();
            } if (strings[i].length() == 1){
                output = stringBuilder.append(((int) strings[i].charAt(0))).toString();
            }*/
