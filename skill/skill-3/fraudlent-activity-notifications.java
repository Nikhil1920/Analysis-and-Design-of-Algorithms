import java.util.*;

// Good working solution but not optimized for this particaular situation
class fradulentActivityNotifications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        boolean isEven = true;
        if (d % 2 != 0)
            isEven = false;
        int warning_count = 0;
        int[] expenditure = new int[n];
        for (int i = 0; i < n; i++) {
            expenditure[i] = sc.nextInt();
        }
        int[] data = new int[201];
        for (int i = 0; i < d; i++) {
            data[expenditure[i]]++;
        }
        for (int i = d; i < expenditure.length; i++) {

            double median_double = 0;
            if (isEven) {
                Integer m1 = null;
                Integer m2 = null;
                int count = 0;
                for (int j = 0; j < data.length; j++) {
                    count += data[j];
                    if (m1 == null && count >= d / 2) {
                        m1 = j;
                    }
                    if (m2 == null && count >= d / 2 + 1) {
                        m2 = j;
                        break;
                    }
                }
                median_double = (m1 + m2);
            } else {
                int count = 0;
                for (int j = 0; j < data.length; j++) {
                    count += data[j];
                    if (count > d / 2) {
                        median_double = j * 2;
                        break;
                    }
                }
            }

            if (expenditure[i] >= median_double) {
                warning_count++;
            }
            data[expenditure[i]]++;
            data[expenditure[i - d]]--;
        }
        System.out.println(warning_count);
        sc.close();
    }
}
