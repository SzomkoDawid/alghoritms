public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("I like another that go fast"));
    }

    public static String spinWords(String string) {
        String [] array = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= 5) {
                array[i] = stringBuilder.append(array[i]).reverse().toString();
            }
        }return String.join(" ", array);
    }
}