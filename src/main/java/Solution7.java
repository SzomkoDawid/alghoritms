/*
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution7 {
    public static void main(String[] args) {
        System.out.println(largeGroupPositions("aaxxxxlllpff"));
    }
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<String> count = new ArrayList<>();
        count.add(S);
            Map<String, Long> counts = count.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }
}*/
