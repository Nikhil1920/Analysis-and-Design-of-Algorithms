class sortArrayOfStrings {

    static void sort(String[] s, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String temp = "";
                if (s[i].length() > s[j].length()) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        String[] arr = { "you", "are", "beautiful", "looking" };
        int n = arr.length;

        // calling the Function to perform sorting
        sort(arr, n);

        System.out.println("Sorted array of strings:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
