import java.util.*;

class Job {
    char id;
    int deadline, profit;

    public Job() {
    }

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void printJobScheduling(ArrayList<Job> arr, int t) {
        int n = arr.size();

        Collections.sort(arr, (a, b) -> b.profit - a.profit);

        boolean result[] = new boolean[t];

        char job[] = new char[t];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(t - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                if (result[j] == false) {
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    sum += arr.get(i).profit;
                    break;
                }
            }
        }

        System.out.println(sum);

        for (char jb : job) {
            System.out.print(jb + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] jobs = new char[n];
        int[] times = new int[n];
        int[] profits = new int[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            profits[i] = sc.nextInt();
        }
        ArrayList<Job> arr = new ArrayList<Job>();

        for (int i = 0; i < n; i++)
            arr.add(new Job(jobs[i], times[i], profits[i]));

        Job job = new Job();

        job.printJobScheduling(arr, n);
        sc.close();
    }
}