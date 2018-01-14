import java.util.Scanner;

public class P546SoldierAndBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int costOfFirstBanana = in.nextInt();
        int initialNumberOfDollars = in.nextInt();
        int numberOfBananas = in.nextInt();

        int totalCostOfBananas = costOfFirstBanana * numberOfBananas * (numberOfBananas + 1) / 2;
        int dollarsToBorrow = Math.max(0, totalCostOfBananas - initialNumberOfDollars);

        System.out.println(dollarsToBorrow);
    }
}
