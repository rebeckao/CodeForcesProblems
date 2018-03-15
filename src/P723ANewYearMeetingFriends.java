import java.util.Scanner;

public class P723ANewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int position1 = in.nextInt();
        int position2 = in.nextInt();
        int position3 = in.nextInt();

        int max = Math.max(position1, Math.max(position2, position3));
        int min = Math.min(position1, Math.min(position2, position3));
        int totalDistance = max - min;

        System.out.println(totalDistance);
    }
}
