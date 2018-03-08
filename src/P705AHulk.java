import java.util.Scanner;

public class P705AHulk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int layersOfFeelings = in.nextInt();

        StringBuilder drBannersFeeling = new StringBuilder("I hate");
        for (int i = 1; i < layersOfFeelings; i++) {
            drBannersFeeling.append(" that I ").append(feel(i));
        }
        drBannersFeeling.append(" it");

        System.out.println(drBannersFeeling.toString());
    }

    private static String feel(int i) {
        if (i % 2 == 1) {
            return "love";
        } else {
            return  "hate";
        }
    }
}
