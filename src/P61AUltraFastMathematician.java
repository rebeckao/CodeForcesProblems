import java.math.BigInteger;
import java.util.Scanner;

public class P61AUltraFastMathematician {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numberOne = in.nextLine();
        String numberTwo = in.nextLine();

        BigInteger bigIntegerOne = new BigInteger(numberOne, 2);
        BigInteger bigIntegerTwo = new BigInteger(numberTwo, 2);

        BigInteger xor = bigIntegerOne.xor(bigIntegerTwo);

        String zeroPaddedBinaryString = String.format("%" + numberOne.length() + "s", xor.toString(2)).replaceAll(" ", "0");
        System.out.println(zeroPaddedBinaryString);
    }
}
