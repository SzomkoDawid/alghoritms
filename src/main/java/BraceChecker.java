public class BraceChecker {
    public static void main(String[] args) {
        String braces = "[]{";
        System.out.println(isValid(braces));
    }

    public static boolean isValid(String braces) {
        boolean output = false;
        String brace1 = "(";
        String brace2 = ")";
        String brace3 = "{";
        String brace4 = "}";
        String brace5 = "[";
        String brace6 = "]";
        if ((braces.contains(brace1) && braces.contains(brace2)) || (braces.contains(brace3) && braces.contains(brace4))
                || (braces.contains(brace5) && braces.contains(brace6)) ){
            output = true;
            return output;
        } else {
            output = false;
            return output;
        }
    }
}
