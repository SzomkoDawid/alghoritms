class Solution2 {
    public static void main(String[] args) {
        String[] names = {};
        System.out.println(whoLikesIt(names));
    }
    public static String whoLikesIt(String... names) {
        String output = "";
        String phrase = "like this";
        String and = "and";
        String secondPhrase = "others like this";
        String phraseLikes = "likes this";
        String noOne = "no one likes this";
        StringBuilder stringBuilder = new StringBuilder();
        if (names.length == 0){
            output = stringBuilder.append(noOne).toString();
            return output;
        }
        for (int i = 0; i < names.length; i++) {
            if (names.length == 1) {
                output = stringBuilder.append(names[i]).append(" " + phraseLikes).toString();
                return output;
            }
            if (names.length == 2) {
                output = stringBuilder.append(names[i]).append(" " + and)
                        .append(" " + names[1]).append(" " + phrase).toString();
                return output;
            }
            if (names.length == 3) {
                output = stringBuilder.append(names[i]).append("," + " " +  names[1])
                        .append(" " + and).append(" " + names[2]).append(" " + phrase).toString();
                return output;
            }

            if (names.length >= 4) {
                int others = names.length - 2;
                output = stringBuilder.append(names[i]).append("," + " " + names[1]).append(" " + and)
                        .append(" " + others).append(" " + secondPhrase).toString();
                return output;
            }
        }
        return output;
    }
}