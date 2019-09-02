import java.util.Arrays;

class Solution6 {
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{2, 4, 9}, 9));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
}
