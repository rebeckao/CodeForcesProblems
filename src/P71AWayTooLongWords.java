import java.util.Scanner;

public class P71AWayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfWords = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numberOfWords; i++) {
            String abbreviation = abbreviateWord(in.nextLine());
            System.out.println(abbreviation);
        }
    }

    private static String abbreviateWord(String word) {
        int wordLength = word.length();
        if (wordLength > 10) {
            return "" + word.charAt(0) + (wordLength - 2) + word.charAt(wordLength - 1);
        } else {
            return word;
        }
    }
}
