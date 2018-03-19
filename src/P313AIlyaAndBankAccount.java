import java.util.Scanner;

public class P313AIlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String accountState = in.nextLine();

        if (Integer.parseInt(accountState) >= 0) {
            System.out.println(accountState);
            return;
        }

        int numberOfCharacters = accountState.length();
        if (numberOfCharacters <= 2) {
            System.out.println(0);
            return;
        }

        char lastDigit = accountState.charAt(numberOfCharacters - 1);
        char secondLastDigit = accountState.charAt(numberOfCharacters - 2);

        char newLastDigit = lastDigit < secondLastDigit ?
                lastDigit :
                secondLastDigit;

        String firstPartOfNumber = accountState.substring(0, numberOfCharacters - 2);
        System.out.println(Integer.parseInt(firstPartOfNumber + newLastDigit));
    }
}
