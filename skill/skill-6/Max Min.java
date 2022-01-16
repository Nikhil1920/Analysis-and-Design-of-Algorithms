import java.util.Arrays;
import java.util.Scanner;

class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        k--;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < size - k; i++) {
            int unfairness = array[k + i] - array[i];
            if (unfairness < result) {
                result = unfairness;
            }
        }
        System.out.println(result);
        sc.close();
    }
}