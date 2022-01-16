import java.util.Scanner;

class Solution {
    public static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(countArray(n, k, x));
        sc.close();
    }

    public static long countArray(int n, int k, int x) {
        long firstCount = 0, secondCount = 1;
        for (int i = 3; i <= n; i++) {
            long temp = secondCount * (k - 1) % MOD;
            secondCount = (firstCount + secondCount * (k - 2)) % MOD;
            firstCount = temp;
        }
        return x == 1 ? firstCount : secondCount;
    }
}