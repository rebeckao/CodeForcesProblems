import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P337APuzzles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        List<Integer> puzzles = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        int smallestPuzzleDiff = puzzles.get(m - 1) - puzzles.get(0);
        for (int i = 0; i <= m - n; i++) {
            int puzzleSizeDiff = puzzles.get(i + n - 1) - puzzles.get(i);
            smallestPuzzleDiff = Math.min(puzzleSizeDiff, smallestPuzzleDiff);
        }

        System.out.println(smallestPuzzleDiff);
    }
}
