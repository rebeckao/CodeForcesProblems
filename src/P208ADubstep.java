import java.util.Scanner;

public class P208ADubstep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String phatBeatsByDJVasya = in.nextLine();

        String yeOldeMusic = phatBeatsByDJVasya.replaceAll("(WUB)+", " ").trim();
        
        System.out.println(yeOldeMusic);
    }
}
