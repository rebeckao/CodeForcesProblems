import java.util.Scanner;

public class P131AcAPSLOCK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        String fixedWord = word;

        if (word.length() == 1) {
            fixedWord = flipLetter(word);
        } else {
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            if (isAllUpperCase(restOfWord)) {
                fixedWord = flipLetter(firstLetter) + restOfWord.toLowerCase();
            }
        }

        System.out.println(fixedWord);
    }

    private static String flipLetter(String letter) {
        return isAllUpperCase(letter) ?
                letter.toLowerCase() :
                letter.toUpperCase();
    }

    private static boolean isAllUpperCase(String word) {
        return word.equals(word.toUpperCase());
    }
}
