import java.util.*;

class lilysHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] values = new long[n];
        long[] reverse_values = new long[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextLong();
        }
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            reverse_values[j] = values[i];
        }
        System.out.println(Math.min(swaps(values), swaps(reverse_values)));

        sc.close();
    }

    public static void swap(long[] array, int index1, int index2) {
        long temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int swaps(long[] unsorted_values) {
        int num_of_swaps = 0;

        Map<Long, Integer> locations = new HashMap<>();
        for (int i = 0; i < unsorted_values.length; i++) {
            locations.put(unsorted_values[i], i);
        }

        long[] sortedValue = unsorted_values.clone();
        Arrays.sort(sortedValue);

        for (int i = 0; i < sortedValue.length; i++) {
            if (sortedValue[i] != unsorted_values[i]) {
                num_of_swaps++;

                int swapIndex = locations.get(sortedValue[i]);
                locations.put(unsorted_values[i], swapIndex);

                swap(unsorted_values, i, swapIndex);
            }
        }
        return num_of_swaps;
    }
}
