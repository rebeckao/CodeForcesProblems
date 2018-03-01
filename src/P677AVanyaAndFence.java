import java.util.Arrays;
import java.util.Scanner;

public class P677AVanyaAndFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfFriends = in.nextInt();
        int heightOfWall = in.nextInt();
        in.nextLine();
        long numberOfBentFriends = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(height -> height > heightOfWall)
                .count();

        System.out.println(numberOfFriends + numberOfBentFriends);
    }
}
