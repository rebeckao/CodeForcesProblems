import java.util.Scanner;

public class P580AKefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int longestSegment = 1;
        int currentSegment = 1;
        int previousMoney = in.nextInt();
        for (int i = 1; i < n; i++) {
            int currentMoney = in.nextInt();
            if (currentMoney < previousMoney) {
                currentSegment = 1;
            } else {
                currentSegment++;
                longestSegment = Math.max(longestSegment, currentSegment);
            }
            previousMoney = currentMoney;
        }

        System.out.println(longestSegment);
    }
}
