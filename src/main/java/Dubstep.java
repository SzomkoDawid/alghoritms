public class Dubstep {
    public static void main(String[] args) {
        System.out.println(SongDecoder("BUWBUWBUWBUWBUWWUB"));
    }

    public static String SongDecoder(String song) {
        String result = "";
        String wub = "WUB";
        for (int i = 0; i < song.length(); i++) {
            if (song.contains(wub)) {
                result = song.replaceAll(wub, " ").trim();
            }
        }
        return result.replaceAll(" +", " ");
    }
}
