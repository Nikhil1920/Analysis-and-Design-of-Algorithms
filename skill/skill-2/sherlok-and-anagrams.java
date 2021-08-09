import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumOfCases = sc.nextInt();

        // call this to remove the next line left from the nextInt above
        sc.nextLine();
        for (int i = 0; i < NumOfCases; ++i) {
            String str = sc.nextLine();
            System.out.println(numofAnagram(str));
        }
        sc.close();
    }

    public static int numofAnagram(String str) {
        int result = 0;
        for (int i = 1; i < str.length(); i++) {
            int[] temp_str = new int[26];

            for (int j = i; j >= 0; j--) {
                temp_str[str.charAt(j) - 'a']++;

                for (int k = 0; k < j; k++) {
                    int[] chars = new int[26];
                    int x = k;
                    int count = 0;
                    while (count <= i - j) {
                        chars[str.charAt(x) - 'a']++;
                        x++;
                        count++;
                    }
                    boolean flag = true;
                    for (x = 0; x < 26; ++x) {
                        if (temp_str[x] != chars[x]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        result++;
                }
            }
        }
        return result;
    }

}