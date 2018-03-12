import java.util.Arrays;
import java.util.Scanner;

public class P200BDrinks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double numberOfDrinkComponents = in.nextDouble();

        in.nextLine();
        int percentageSums = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sum();


        System.out.println(percentageSums/numberOfDrinkComponents);
    }
}
