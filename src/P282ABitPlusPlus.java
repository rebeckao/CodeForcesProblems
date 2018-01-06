import java.util.Scanner;

public class P282ABitPlusPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        int x = 0;

        for (int i = 0; i < n; i++) {
            if (in.nextLine().contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
    }
}
