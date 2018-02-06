import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P59AWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        Pattern upperCase = Pattern.compile("[A-Z]");
        Matcher upperCaseMatcher = upperCase.matcher(word);

        int numberOfUpperCaseLetters = 0;

        while (upperCaseMatcher.find()) {
            numberOfUpperCaseLetters++;
        }

        if (numberOfUpperCaseLetters > (word.length() / 2)) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
