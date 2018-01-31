import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class P318AEvenOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigDecimal n = in.nextBigDecimal();
        BigDecimal k = in.nextBigDecimal();
        BigDecimal TWO = BigDecimal.valueOf(2);

        BigDecimal halfN = n.divide(TWO, RoundingMode.CEILING);
        if (k.compareTo(halfN) <= 0) {
            System.out.println(k.multiply(TWO).subtract(BigDecimal.ONE));
        } else {
            System.out.println(k.subtract(halfN).multiply(TWO));
        }
    }
}
