import java.util.Scanner;

public class P116ATram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int maxPassengers = 0;
        int currentPassengers = 0;

        for (int i = 0; i < n; i++) {
            int exitingPassengers = in.nextInt();
            int enteringPassengers = in.nextInt();

            currentPassengers -= exitingPassengers;
            currentPassengers += enteringPassengers;

            maxPassengers = Math.max(maxPassengers, currentPassengers);
        }

        System.out.println(maxPassengers);
    }
}
