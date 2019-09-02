public class Disemvowel {
    public static void main(String[] args) {
        String str = "Your Website is Attacked by TROLL LOL!";
        removeVowel(str);
    }

    private static String removeVowel(String str) {
        String [] strings = str.split("[AEIOUaeiou]");
        for(String s : strings){
            System.out.print(s);
        }
        return str;
    }
}
