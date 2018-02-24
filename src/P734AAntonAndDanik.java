import java.util.Scanner;

public class P734AAntonAndDanik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfGames = in.nextInt();
        in.nextLine();
        String gameOutcomes = in.nextLine();

        int danikWins = gameOutcomes.replaceAll("A", "").length();
        int antonWins = numberOfGames - danikWins;

        if (danikWins > antonWins) {
            System.out.println("Danik");
        } else if (antonWins > danikWins) {
            System.out.println("Anton");
        } else {
            System.out.println("Friendship");
        }
    }
}
