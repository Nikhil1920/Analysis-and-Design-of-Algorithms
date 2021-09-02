
// SherlockAndMiniMax
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int p = sc.nextInt();
        int q = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int m = p;
        int res = p;

        for (int i = p; i <= q; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (Math.abs(array[j] - i) < min) {
                    min = Math.abs(array[j] - i);
                    m = i;
                }
            }
            if (min > max) {
                max = min;
                res = m;
            }
        }
        System.out.println(res);
        sc.close();
    }
}