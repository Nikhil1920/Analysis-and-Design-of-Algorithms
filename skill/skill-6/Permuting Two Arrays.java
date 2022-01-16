import java.util.Arrays;
import java.util.Scanner;

class PermutingTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean result = true;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < n; i++) {
                if (a[i] + b[n - i - 1] < k) {
                    result = false;
                    break;
                }
            }
            System.out.println(result ? "YES" : "NO");
            num_of_cases--;
        }
        sc.close();
    }
}