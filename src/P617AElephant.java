import java.util.Scanner;

public class P617AElephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int elephantFriendCoordinate = in.nextInt();

        int steps = (int) Math.ceil(elephantFriendCoordinate / 5.0);

        System.out.println(steps);
    }
}
