public class Solution10
{
    public static void main(String[] args) {
        System.out.println(minimumNumber(new int[]{3, 2, 5, 5}));
    }
    public static int minimumNumber(int[] numbers)
    {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int prime = sum;
        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                prime++;
                i=2;
            }
            else { continue; }
        }
        return prime-sum;
    }
}