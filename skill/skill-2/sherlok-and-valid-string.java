import java.util.*;

class sherlokAndValidString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean isValid = true;

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        int available_deductions = 1;
        for (int i = 0; i < 26; i++) {
            if (count[i] != count[str.charAt(0) - 'a'] && count[i] != 0) {
                if (available_deductions > 0) {
                    count[i]--;
                    available_deductions--;
                    continue;
                }
                isValid = false;
                break;
            }
        }
        String result = isValid ? "YES" : "NO";
        System.out.println(result);
        sc.close();
    }
}
