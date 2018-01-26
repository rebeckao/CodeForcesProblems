import java.math.BigInteger;
import java.util.Scanner;

public class P486CalculatingFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(calculatingFunction(in.nextBigInteger()));
    }

    private static BigInteger calculatingFunction(BigInteger n) {
        BigInteger TWO = BigInteger.valueOf(2);
        if (n.mod(TWO).equals(BigInteger.ZERO)) {
            return n.divide(TWO);
        } else {
            return n.add(BigInteger.ONE).divide(TWO).negate();
        }
    }
}
