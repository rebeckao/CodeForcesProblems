import java.util.Scanner;

public class P41ATranslation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String reversedWord = new StringBuilder(word).reverse().toString();
        String secondWord = in.nextLine();

        if (secondWord.contentEquals(reversedWord)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
