import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P141AAmusingJoke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String names = in.nextLine() + in.nextLine();
        String lettersInPile = in.nextLine();

        List<Integer> sortedLettersInNames = sortedLettersOf(names);
        List<Integer> sortedLettersInPile = sortedLettersOf(lettersInPile);

        if (sortedLettersInNames.equals(sortedLettersInPile)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static List<Integer> sortedLettersOf(String word) {
        return word.chars().sorted().boxed().collect(Collectors.toList());
    }
}
