import java.util.Scanner;

public class P96AFootball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerPositions = in.nextLine();

        if (playerPositions.contains("1111111") || playerPositions.contains("0000000")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
