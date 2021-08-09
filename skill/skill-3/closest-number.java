import java.util.*;

class closestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_test_cases = sc.nextInt();
        while (num_of_test_cases > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long x = sc.nextInt();
            long apowb = (long) Math.pow(a, b);
            if (apowb % x > x / 2)
                System.out.println(apowb + x - apowb % x);
            else
                System.out.println(apowb - apowb % x);
            num_of_test_cases--;
        }
        sc.close();
    }
}
