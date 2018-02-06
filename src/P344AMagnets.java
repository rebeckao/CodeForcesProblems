import java.util.Scanner;

public class P344AMagnets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int groups = 1;
        int previous = in.nextInt();

        for (int i = 1; i < n; i++) {
            int next = in.nextInt();
            if (next != previous) {
                groups++;
            }
            previous = next;
        }

        System.out.println(groups);
    }
}
