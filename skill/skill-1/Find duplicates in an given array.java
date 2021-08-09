import java.util.*;

class FindDuplicatesInAnGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            boolean isUnique = true;
            if (arr[i] == -1)
                continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    isUnique = false;
                }
            }
            if (!isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
