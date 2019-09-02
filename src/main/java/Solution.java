public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static  int solution(int number) {
        int sum = 0;
        int output = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                output = sum=sum+i;
            }
        } return output;
    }
}
