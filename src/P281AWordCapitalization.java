import java.util.Scanner;

public class P281AWordCapitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);

        System.out.println(capitalized);
    }
}
