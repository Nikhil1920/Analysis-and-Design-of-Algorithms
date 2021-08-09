import java.util.*;

class insertionSortPartI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(n, arr);
        sc.close();
    }

    public static void sort(int n, int[] arr) {
        int key = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            if (arr[j] < key) {
                arr[j + 1] = key;
                printArray(arr);
                return;
            } else {
                arr[j + 1] = arr[j];
                printArray(arr);
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
