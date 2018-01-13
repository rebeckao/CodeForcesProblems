import java.util.Arrays;
import java.util.Scanner;

public class P160ATwins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();

        String coinValues = in.nextLine();
        int[] sortedCoins = Arrays.stream(coinValues.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int coinSum = Arrays.stream(sortedCoins).sum();

        int myCoinSum = 0;
        int coinsPicked = 0;

        while (myCoinSum * 2 <= coinSum) {
            myCoinSum += sortedCoins[sortedCoins.length - 1 - coinsPicked];
            coinsPicked++;
        }

        System.out.println(coinsPicked);
    }
}
