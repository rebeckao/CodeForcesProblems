import java.util.Arrays;
import java.util.Scanner;

public class P148AInsomniaCure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] dragonCoefficients = new int[]{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
        int dragons = in.nextInt();

        int[] dragonPain = new int[dragons];
        for (int dragonCoefficient : dragonCoefficients) {
            int currentPainIndex = dragonCoefficient - 1;
            while (currentPainIndex < dragonPain.length) {
                dragonPain[currentPainIndex] = 1;
                currentPainIndex += dragonCoefficient;
            }
        }

        System.out.println(Arrays.stream(dragonPain).sum());
    }
}
