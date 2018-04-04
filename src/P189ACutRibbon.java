import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P189ACutRibbon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalLength = in.nextInt();

        List<Integer> possibleLengths = Arrays.asList(in.nextInt(), in.nextInt(), in.nextInt());
        Collections.sort(possibleLengths);

        int pieces = getMaximumNumberOfPieces(totalLength, possibleLengths);

        System.out.println(pieces);
    }

    private static int getMaximumNumberOfPieces(int totalLength, List<Integer> possibleLengths) {
        int numberOfPossibleLengths = possibleLengths.size();
        int[] contenders = new int[numberOfPossibleLengths];

        for (int i = 0; i < numberOfPossibleLengths; i++) {
            Integer possibleLength = possibleLengths.get(i);
            int maximumNumberOfPieces;
            if (totalLength < possibleLength) {
                maximumNumberOfPieces = -9999;
            } else if (totalLength == possibleLength) {
                maximumNumberOfPieces = 1;
            } else {
                maximumNumberOfPieces = 1 + getMaximumNumberOfPieces(
                        totalLength - possibleLength,
                        possibleLengths.subList(i, numberOfPossibleLengths)
                );
            }
            contenders[i] = maximumNumberOfPieces;
        }

        return Arrays.stream(contenders).max().orElse(0);
    }
}
