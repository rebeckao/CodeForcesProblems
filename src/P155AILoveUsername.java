import java.util.Scanner;

public class P155AILoveUsername {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfContests = in.nextInt();
        int firstContest = in.nextInt();

        int previousWorst = firstContest;
        int previousBest = firstContest;
        int numberOfAmazes = 0;

        for (int contest = 1; contest < numberOfContests; contest++) {
            int contestScore = in.nextInt();

            if (contestScore > previousBest) {
                previousBest = contestScore;
                numberOfAmazes++;
            } else if (contestScore < previousWorst) {
                previousWorst = contestScore;
                numberOfAmazes++;
            }
        }

        System.out.println(numberOfAmazes);
    }
}
