import java.util.Scanner;

public class P110ANearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();

        int luckyDigits = number.length() - number.replaceAll("[47]", "").length();

        if (luckyDigits == 4 || luckyDigits == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
