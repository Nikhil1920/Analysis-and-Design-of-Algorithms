import java.util.*;

class harry_sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");

        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the numbers with a space between them");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        sort(num, 0, num.length - 1);

        System.out.println("\nSorted array");

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Recursive call to sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int s1 = m - l + 1;
        int s2 = r - m;

        // Create temp arrays
        int L[] = new int[s1];
        int R[] = new int[s2];

        // Copy data to temp arrays
        for (int i = 0; i < s1; ++i)
            L[i] = arr[l + i];

        for (int j = 0; j < s2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < s1 && j < s2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < s1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < s2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}