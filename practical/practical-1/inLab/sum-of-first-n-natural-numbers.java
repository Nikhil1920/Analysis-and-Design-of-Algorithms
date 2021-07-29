class sum {
    public static void main(String[] args) {
        int sum = sumOfNNaturalNumsUsingFormula(6);
        System.out.println("sum is = " + sum);
    }

    public static int sumOfNNaturalNumsUsingLoop(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int sumOfNNaturalNumsUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
