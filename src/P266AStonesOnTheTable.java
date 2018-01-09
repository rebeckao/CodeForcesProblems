import java.util.Scanner;

public class P266AStonesOnTheTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();

        String originalStones = in.nextLine();
        String happyNeighbourStones = originalStones.replaceAll("([RGB])\\1+", "$1");

        System.out.println(originalStones.length() - happyNeighbourStones.length());
    }
}
