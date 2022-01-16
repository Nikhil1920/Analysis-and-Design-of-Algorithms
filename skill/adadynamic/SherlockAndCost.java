
// Sherlock and Cost
import java.util.Scanner;

class SherlockAndCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int high = 0, low = 0;
            for (int i = 1; i < n; i++) {
                int high_low_diff = Math.abs(arr[i - 1] - 1);
                int low_high_diff = Math.abs(arr[i] - 1);
                int high_high_diff = Math.abs(arr[i] - arr[i - 1]);

                int low_next = Math.max(low, high + high_low_diff);
                int high_next = Math.max(high + high_high_diff, low + low_high_diff);

                low = low_next;
                high = high_next;
            }
            System.out.println(Math.max(low, high));
        }
        sc.close();
    }
}