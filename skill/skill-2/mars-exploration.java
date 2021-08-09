import java.util.*;

class marsExploration {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        int message_length = message.length();
        for (int i = 0; i < message_length; i += 3) {
            if (message.charAt(i) != 'S')
                result++;
            if (message.charAt(i + 1) != 'O')
                result++;
            if (message.charAt(i + 2) != 'S')
                result++;
        }
        System.out.println(result);
        sc.close();
    }
}