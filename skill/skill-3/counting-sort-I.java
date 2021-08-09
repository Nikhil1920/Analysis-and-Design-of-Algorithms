import java.util.*;

class countingSortI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[100];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[temp]++;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}