import java.util.Arrays;
import java.util.Scanner;

class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] children = new int[n];
        for (int i = 0; i < n; i++) {
            children[i] = sc.nextInt();
        }
        int[] count = new int[n];
        Arrays.fill(count, 1);
        for (int i = 0; i < n - 1; i++) {
            if (children[i + 1] > children[i]) {
                count[i + 1] = count[i] + 1;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (children[i - 1] > children[i] && count[i - 1] <= count[i]) {
                count[i - 1] = count[i] + 1;
            }
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += count[i];
        }
        System.out.println(result);
        sc.close();
    }
}