import java.util.Scanner;

public class P451AGameWithSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int smallestDimension = Math.min(n, m);

        if (smallestDimension % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}
