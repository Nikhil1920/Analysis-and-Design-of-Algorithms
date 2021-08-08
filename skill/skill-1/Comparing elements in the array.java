import java.util.*;

class ComparingElementsInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_test_cases = sc.nextInt();
        while (num_of_test_cases > 0) {
            boolean isNo = true;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println("YES");
                num_of_test_cases--;
                continue;
            }

            for (int i = 0; i < n; i++) {
                int left_sum = 0;
                int right_sum = 0;
                for (int j = 0; j < n; j++) {
                    if (j < i) {
                        left_sum += arr[j];
                    } else if (j > i) {
                        right_sum += arr[j];
                    }
                }
                if (left_sum == right_sum) {
                    isNo = false;
                    break;
                }
            }
            System.out.println(isNo ? "NO" : "YES");
            num_of_test_cases--;
        }
        sc.close();
    }
}