
// SherlockAndMiniMax
import java.util.Arrays;
import java.util.Scanner;

class SherlockAndMiniMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextLong();

        long p = sc.nextLong();
        long q = sc.nextLong();

        Arrays.sort(array);

        long res;
        if (array[0] > q)
            res = p;
        else if (array[n - 1] < p)
            res = q;
        else {
            long ans = -1;
            long num = -1;
            if (array[0] > p) {
                if (ans < (array[0] - p)) {
                    ans = (array[0] - p);
                    num = p;
                }
            }

            if (array[n - 1] < q) {
                if (ans < (q - array[n - 1])) {
                    ans = (q - array[n - 1]);
                    num = q;
                }
            }
            for (int i = 0; i < n - 1; i++) {
                long cur = (array[i] + array[i + 1]) / 2;
                if (cur <= q && cur >= p && (cur - array[i]) > ans) {
                    ans = (cur - array[i]);
                    num = cur;
                } else if (cur > q) {
                    if ((q - array[i]) > ans) {
                        ans = (q - array[i]);
                        num = q;
                    }
                } else if (cur < p) {
                    if ((array[i + 1] - p) > ans) {
                        ans = (array[i + 1] - p);
                        num = p;
                    }
                }
            }
            res = num;
        }
        System.out.println(res);
        sc.close();
    }
}