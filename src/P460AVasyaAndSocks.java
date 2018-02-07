import java.util.Scanner;

public class P460AVasyaAndSocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int x = 1;
        while (socksByMorning(x, n, m) > 0) {
            x++;
        }

        System.out.println(x);
    }

    private static int socksByMorning(int day, int n, int m) {
        return n - day + (day/m);
    }
}
