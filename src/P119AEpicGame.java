import java.math.BigInteger;
import java.util.Scanner;

public class P119AEpicGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger simonNumber = in.nextBigInteger();
        BigInteger antiSimonNumber = in.nextBigInteger();
        BigInteger[] playerNumbers = new BigInteger[]{simonNumber, antiSimonNumber};

        BigInteger numberOfStones = in.nextBigInteger();

        int currentPlayer = 0;
        while (numberOfStones.compareTo(BigInteger.ZERO) > 0) {
            BigInteger greatestCommonDivisor = playerNumbers[currentPlayer].gcd(numberOfStones);
            numberOfStones = numberOfStones.subtract(greatestCommonDivisor);
            currentPlayer = nextPlayer(currentPlayer);
        }

        System.out.println(nextPlayer(currentPlayer));
    }

    private static int nextPlayer(int turn) {
        return (turn + 1) % 2;
    }
}
