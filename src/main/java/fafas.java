public class fafas {
    public static void main(String[] args) {
        int number = 50;
        solution(number);
    }
    public static void solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(sum=sum+i);
            }
        }
    }
}