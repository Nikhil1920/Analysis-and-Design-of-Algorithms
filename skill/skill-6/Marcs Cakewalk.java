
// MarcsCakewalk
import java.util.Arrays;
import java.util.Scanner;

class MarcsCakewalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += (long) (Math.pow(2, i) * arr[n - i - 1]);
        }
        System.out.println(res);
        sc.close();
    }
}