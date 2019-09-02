public class kakakakaka {
    public static void main(String[] args) {
        String output = "";
        String s = "WUBWEWUBAREWUBWUBTHEWUBWUBCHAMPIONSWUBMYWUBFRIENDWUB";
        String wub = "WUB";
        if (s.contains(wub)) {
            output = s.replaceAll(wub, " ").trim();
            String[] s1 = output.split(" ");
            for (String s2: s1){
                System.out.println(s2);
                output = s2;
                if (output.contains(" ")){

                }
            }
        }
    }
}

