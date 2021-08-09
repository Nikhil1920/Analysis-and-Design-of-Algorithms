import java.util.*;

class gameOFThronesI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isPalindrome = false;
        int[] alpha_count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha_count[s.charAt(i) - 'a']++;
        }
        int odd_count = 0;
        for (int i = 0; i < 26; i++) {
            if (alpha_count[i] != 0 && alpha_count[i] % 2 != 0)
                odd_count++;
        }
        if (s.length() % 2 == 0) {
            if (odd_count == 0) {
                isPalindrome = true;
            }
        } else {
            if (odd_count == 1) {
                isPalindrome = true;
            }
        }

        String result = isPalindrome ? "YES" : "NO";
        System.out.println(result);
        sc.close();
    }
}
