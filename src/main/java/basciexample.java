public class basciexample {
    public static void main(String[] args) {
        String string = "please encrypt me";
        int rule = 2;
        encrypt(string, rule);
    }
    public static void encrypt(String text, int rule) {
        int output = 0;
        int i = 0;
        char [] chars = text.toCharArray();
        for (Character character: chars){
           output = (int) character + rule;
        }
    }
}