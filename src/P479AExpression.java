import java.util.Scanner;

public class P479AExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(biggestNumber(a, b, c));
    }

    private static int biggestNumber(int a, int b, int c) {
        if (a == 1 && c == 1) {
            return a + b + c;
        }

        if (a == 1) {
            return (a + b) * c;
        }

        if (c == 1) {
            return a * (b + c);
        }

        if (b == 1) {
            return Math.max(
                    (a + b) * c,
                    a * (b + c)
            );
        }

        return a * b * c;
    }


}
