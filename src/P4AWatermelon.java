import java.util.Scanner;

public class P4AWatermelon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();

        boolean divisible = isDivisibleIntoEvenNumberOfKilos(weight);

        System.out.println(divisible? "YES" : "NO");
    }

    private static boolean isDivisibleIntoEvenNumberOfKilos(int weight) {
        boolean weightIsEven = weight % 2 == 0;
        boolean atLeastTwoParts = weight / 2 >= 2;
        return weightIsEven && atLeastTwoParts;
    }

}
