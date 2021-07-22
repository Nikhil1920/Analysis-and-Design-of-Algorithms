class sortArrayOfStrings {

    static void mySort(String[] s, int n) {
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

    // Function to print the sorted array of string
    static void printArraystring(String str[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }

    // Driver function
    public static void main(String args[]) {
        String[] arr = { "you", "are", "beautiful", "looking" };
        int n = arr.length;

        // Function to perform sorting
        mySort(arr, n);

        printArraystring(arr, n);

    }

}
