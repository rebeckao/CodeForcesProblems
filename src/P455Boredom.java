import java.util.Scanner;

public class P455Boredom {
    private static final int UPPER_LIMIT = 100_001;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfValues = in.nextInt();

        int[] occurences = new int[UPPER_LIMIT];
        for (int i = 0; i < numberOfValues; i++) {
            int value = in.nextInt();
            occurences[value]++;
        }

        System.out.println(maxScore(occurences));
    }

    private static long maxScore(int[] occurrences) {
        long scoreForPrevious = 0;
        long scoreForOneBeforePrevious = 0;

        for (int i = 1; i < UPPER_LIMIT; i++) {
            long scoreForThis = getScoreForNumber(occurrences, i);
            long newHighScore = Math.max(scoreForPrevious, scoreForOneBeforePrevious + scoreForThis);
            scoreForOneBeforePrevious = scoreForPrevious;
            scoreForPrevious = newHighScore;
        }

        return scoreForPrevious;
    }

    private static long getScoreForNumber(int[] occurrences, Integer chosenNumber) {
        return chosenNumber * (long) occurrences[chosenNumber];
    }

}
