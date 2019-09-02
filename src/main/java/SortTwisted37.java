import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.sort;

public class Kata5 {
    public static void main(String[] args) {
        Arrays.stream(sortTwisted37(new Integer[]{12,13,14})).forEach(System.out::println);
        swap37(0);
    }

    private static Integer swap37(Integer i) {
        return Integer.valueOf(i.toString()
                .replace("7", "_")
                .replace("3", "7")
                .replace("_", "3")
        );
    }

    public static Integer[] sortTwisted37(Integer[] array)
    {
        return Arrays.stream(array)
                .map(Kata5::swap37)
                .sorted(Integer::compare)
                .map(Kata5::swap37)
                .toArray(Integer[]::new);
    }
}