class Main {
    public static void oddEvenSort(String arr[], int n) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            String temp;

            for (int i = 1; i <= n - 2; i = i + 2) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }

            for (int i = 0; i <= n - 2; i = i + 2) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        return;
    }

    public static void main(String[] args) {
        String arr[] = { "nikhil", "vyshnav", "anirudh", "mukund" };
        int n = arr.length;

        oddEvenSort(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println(" ");
    }
}