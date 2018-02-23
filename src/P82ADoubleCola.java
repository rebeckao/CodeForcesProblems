import java.util.Scanner;

public class P82ADoubleCola {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        long currentQueue = calculateCurrentQueue(n);

        long lengthOfAllPreviousQueues = 5 * ((long)(Math.pow(2, currentQueue) - 1));
        long indexInCurrentQueue = n - lengthOfAllPreviousQueues;
        long numberOfSamePersonsInQueue = (long) Math.pow(2, currentQueue);
        int originalPersonIndex = (int) Math.ceil((1.0 * indexInCurrentQueue) / numberOfSamePersonsInQueue) - 1;

        String[] originalPeopleQueue = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

        System.out.println(originalPeopleQueue[originalPersonIndex]);
    }

    private static long calculateCurrentQueue(long n) {
        return (long) Math.ceil(log2(n / 5.0 + 1) - 1);
    }

    private static double log2(double value) {
        return Math.log(value)/Math.log(2);
    }
}
