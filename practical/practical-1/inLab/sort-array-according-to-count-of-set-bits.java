class sortArrayAccordingToCountOfSetBits {
    static int countBits(int a) {
        int count = 0;
        while (a > 0) {
            if ((a & 1) > 0)
                count += 1;
            a = a >> 1;
        }
        return count;
    }

    static void sortByCountOfSetBit(int arr[], int n) {
        int setBitCount[] = new int[n];
        for (int i = 0; i < n; i++)
            setBitCount[i] = countBits(arr[i]);
        for (int i = 1; i < n; i++) {
            int bitCountKey = setBitCount[i];
            int arrkey = arr[i];
            int j = i - 1;

            while (j >= 0 && setBitCount[j] < bitCountKey) {
                setBitCount[j + 1] = setBitCount[j];
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            setBitCount[j + 1] = bitCountKey;
            arr[j + 1] = arrkey;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        sortByCountOfSetBit(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
