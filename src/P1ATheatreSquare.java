import java.math.BigInteger;
import java.util.Scanner;

public class P1ATheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int squareWidth = in.nextInt();
        int squareHeight = in.nextInt();
        int flagstoneSide = in.nextInt();

        BigInteger requiredNumberOfStones = calculateRequiredNumberOfStones(squareWidth, squareHeight, flagstoneSide);

        System.out.println(requiredNumberOfStones);
    }

    private static BigInteger calculateRequiredNumberOfStones(int squareWidth, int squareHeight, int flagstoneSide) {
        return divideAndRoundUp(squareWidth, flagstoneSide).multiply(divideAndRoundUp(squareHeight, flagstoneSide));
    }

    private static BigInteger divideAndRoundUp(int numerator, int divisor) {
        return BigInteger.valueOf((int) Math.ceil((double) numerator / divisor));
    }

}
