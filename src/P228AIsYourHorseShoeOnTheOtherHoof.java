import java.util.Arrays;
import java.util.Scanner;

public class P228AIsYourHorseShoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long distinctColors = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .distinct()
                .count();

        System.out.println(4 - distinctColors);
    }
}
