public class Solution3 {
    public static void main(String[] args) {
        System.out.println(dashatize(69201));
    }

    public static String dashatize(int num) {
        return Integer.toString(num).replaceAll("([13579])","-$1-").replaceAll("--","-").replaceAll("^-","").replaceAll("-$","");

    }
}