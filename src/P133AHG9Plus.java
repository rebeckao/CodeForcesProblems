import java.util.Scanner;

public class P133AHG9Plus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String program = in.nextLine();

        if (program.contains("H") || program.contains("Q") || program.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
