import java.util.*;

// Good working solution but not optimized for this particaular situation
class fradulentActivityNotifications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int d_half = d / 2;
        int odd_middle = (d + 1) / 2;
        boolean isEven = true;
        if (d % 2 != 0)
            isEven = false;
        int warning_count = 0;
        int[] expenditure = new int[n];
        for (int i = 0; i < n; i++) {
            expenditure[i] = sc.nextInt();
        }
        for (int i = 0; i < n - d - 1; i++) {
            int median = 0;
            int[] temp = new int[d];
            for (int j = 0; j < d; j++) {
                temp[j] = expenditure[i + j];
            }
            Arrays.sort(temp);
            if (isEven) {
                median = (temp[d_half] + temp[d_half + 1]);
            } else {
                median = temp[odd_middle] * 2;
            }
            if (expenditure[i + d + 1] >= median)
                warning_count++;
        }
        System.out.println(warning_count);
        sc.close();
    }
}
