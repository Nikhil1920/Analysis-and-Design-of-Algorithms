import java.util.*;

class ComparingElementsInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_test_cases = sc.nextInt();
        while (num_of_test_cases > 0) {
            boolean isNo = true;
            int n = sc.nextInt();
            int[] arr = new int[n];
            int total_sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                total_sum += arr[i];
            }
            int sum = 0;
            for (int current : arr) {
                if (2 * sum == total_sum - current)
                    isNo = false;
                else
                    sum += current;
            }
            System.out.println(isNo ? "NO" : "YES");
            num_of_test_cases--;
        }
        sc.close();
    }
}