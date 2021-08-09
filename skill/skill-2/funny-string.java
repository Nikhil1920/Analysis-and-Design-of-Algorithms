import java.util.*;

class funnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_test_cases = sc.nextInt();
        while (num_of_test_cases > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            boolean isValid = false;
            int[] diff_list = new int[s.length() - 1];
            int[] rev_diff_list = new int[s.length() - 1];
            sb.append(s);
            sb.reverse();
            String reverse_s = sb.toString();

            for (int i = 1; i < s.length(); i++) {
                diff_list[i - 1] = Math.abs(s.charAt(i) - s.charAt(i - 1));
                rev_diff_list[i - 1] = Math.abs(reverse_s.charAt(i) - reverse_s.charAt(i - 1));
            }
            isValid = Arrays.equals(diff_list, rev_diff_list);
            String result = isValid ? "Funny" : "Not Funny";
            System.out.println(result);
            num_of_test_cases--;
        }
        sc.close();
    }
}