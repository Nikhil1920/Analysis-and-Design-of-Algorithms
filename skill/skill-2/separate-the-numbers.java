import java.util.*;

class separateTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_test_cases = sc.nextInt();
        while (num_of_test_cases > 0) {
            String s = sc.next();
            boolean isValid = false;
            long output_first = 0;
            for (int i = 1; i <= s.length() / 2; i++) {
                long temp_first = Long.parseLong(s.substring(0, i));
                output_first = temp_first;
                String temp = Long.toString(temp_first);
                while (temp.length() < s.length()) {
                    temp += Long.toString(++temp_first);
                }
                if (temp.equals(s)) {
                    isValid = true;
                    break;
                }
            }
            String result = isValid ? "YES " + output_first : "NO";
            System.out.println(result);
            num_of_test_cases--;
        }
        sc.close();
    }
}
