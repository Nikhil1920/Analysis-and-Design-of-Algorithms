class sortArrayAccordingToCountOfSetBits {
    // Function to count the number of set bits
    static int countBits(int a) {
        int count = 0;
        while (a > 0) {
            if ((a & 1) > 0)
                count += 1;
            a = a >> 1;
        }
        return count;
    }

    static void insertionSort(int arr[], int aux[], int n) {
        for (int i = 1; i < n; i++) {
            // use 2 keys because we
            // need to sort both
            // arrays simultaneously
            int key1 = aux[i];
            int key2 = arr[i];
            int j = i - 1;

            while (j >= 0 && aux[j] < key1) {
                aux[j + 1] = aux[j];
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            aux[j + 1] = key1;
            arr[j + 1] = key2;
        }
    }

    static void sortBySetBitCount(int arr[], int n) {
        int aux[] = new int[n];
        for (int i = 0; i < n; i++)
            aux[i] = countBits(arr[i]);

        insertionSort(arr, aux, n);
    }

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        sortBySetBitCount(arr, n);
        printArr(arr, n);
    }

}
