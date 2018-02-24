import java.util.Scanner;

public class P520APangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.nextLine();

        long distinctLetters = in.nextLine().toLowerCase()
                .chars()
                .distinct()
                .count();

        if (distinctLetters == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
