import java.util.Scanner;

public class P231ATeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int solvableProblems = 0;

        for (int i = 0; i < n; i++) {
            int petya = in.nextInt();
            int vasya = in.nextInt();
            int tonya = in.nextInt();
            if (petya + vasya + tonya >= 2) {
                solvableProblems++;
            }
        }

        System.out.println(solvableProblems);
    }
}
