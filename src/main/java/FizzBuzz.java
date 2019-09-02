public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzbuzz(50));
    }
    public static String fizzbuzz(int value) throws RuntimeException  {
        if (value < 0){
            throw new NoFizzBuzzException("Nie obsługuje cyfr ujemnych");
        }
        if (value % 15 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        }
        else if (value < 0){
            throw new RuntimeException("Not found");
        }
        else {
            return String.valueOf(value);
        }
    }
}


