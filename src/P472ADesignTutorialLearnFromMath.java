import java.util.Scanner;

public class P472ADesignTutorialLearnFromMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println("4 " + (n - 4));
        } else {
            System.out.println("9 " + (n - 9));
        }
    }
}
