class sum {
    public static void main(String[] args) {
        int sum = sumOfN(3);
        System.out.println("sum is = " + sum);
    }

    public static int sumOfN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}