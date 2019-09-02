import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class HumanReadableTime {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 8, 5, 4};
        sortArray(array);
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                IntStream.of(array).sorted().forEach(System.out::println);
            } else {
                System.out.println(array);
            }
        }
    }
}