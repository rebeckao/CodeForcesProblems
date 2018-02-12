import java.util.Scanner;

public class P379ANewYearCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int remainingCandles = in.nextInt();
        int frankensteinCoefficient = in.nextInt();

        int totalHoursOfRomance = 0;
        int totalCandleParts = 0;

        while (remainingCandles > 0) {
            totalHoursOfRomance += remainingCandles;
            totalCandleParts += remainingCandles;
            remainingCandles = totalCandleParts / frankensteinCoefficient;
            totalCandleParts %= frankensteinCoefficient;
        }
        
        System.out.println(totalHoursOfRomance);
    }
}
