import java.util.Scanner;

public class P443AAntonAndLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String letterSet = in.nextLine().replaceAll("[{,} ]", "");

        long numberOfDistinctChars = letterSet.chars().distinct().count();

        System.out.println(numberOfDistinctChars);
    }
}
