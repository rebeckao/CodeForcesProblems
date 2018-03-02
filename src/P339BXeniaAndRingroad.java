import java.math.BigInteger;
import java.util.Scanner;

public class P339BXeniaAndRingroad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfHouses = in.nextInt();
        int numberOfTasks = in.nextInt();

        int previousHouse = 1;
        BigInteger totalTime = BigInteger.ZERO;
        for (int i = 0; i < numberOfTasks; i++) {
            int nextHouse = in.nextInt();
            if (nextHouse > previousHouse) {
                totalTime = totalTime
                        .add(BigInteger.valueOf(nextHouse))
                        .subtract(BigInteger.valueOf(previousHouse));
            } else if (nextHouse < previousHouse) {
                totalTime = totalTime
                        .add(BigInteger.valueOf(numberOfHouses))
                        .subtract(BigInteger.valueOf(previousHouse))
                        .add(BigInteger.valueOf(nextHouse));
            }
            previousHouse = nextHouse;
        }

        System.out.println(totalTime);
    }
}
