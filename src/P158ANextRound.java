import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P158ANextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfContestants = in.nextInt();
        int k = in.nextInt();

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < numberOfContestants; i++) {
            scores.add(in.nextInt());
        }

        int kthScore = scores.get(k - 1);

        long advancingContestants = scores.stream()
                .filter(score -> score > 0)
                .filter(score -> score >= kthScore)
                .count();

        System.out.println(advancingContestants);
    }
}
