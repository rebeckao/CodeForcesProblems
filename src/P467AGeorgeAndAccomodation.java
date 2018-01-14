import java.util.Scanner;

public class P467AGeorgeAndAccomodation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int potentialRooms = 0;
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int q = in.nextInt();
            if (q - p >= 2) {
                potentialRooms++;
            }
        }

        System.out.println(potentialRooms);
    }
}
