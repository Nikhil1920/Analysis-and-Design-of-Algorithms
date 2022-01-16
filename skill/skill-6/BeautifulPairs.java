
// BeautifulPairs
import java.util.Scanner;

class BeautifulPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[1002];
        int result = 0;
        for (int i = 0; i < n; i++)
            count[sc.nextInt()]++;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (count[temp] > 0) {
                result++;
                count[temp]--;
            }
        }
        if (result == n)
            result--;
        else
            result++;
        System.out.println(result);
        sc.close();
    }
}