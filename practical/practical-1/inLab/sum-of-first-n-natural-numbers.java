class sum {
    public static void main(String[] args) {
        int sum = sumOfNNaturalNums(3);
        System.out.println("sum is = " + sum);
    }

    public static int sumOfNNaturalNums(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
