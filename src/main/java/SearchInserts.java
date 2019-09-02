import java.util.Arrays;
class Solution9 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 3));
    }
    public static int searchInsert(int[] nums, int target) {
        int output = 3;
        String [] strings = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        String string = String.valueOf(target);
        for (int i = 0; i < strings.length ; i++) {
            if (string == strings[i]){
                return strings[i].indexOf(string);
            }
        } return output;
    }
}