import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P136APresents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] whoGaveGiftToFriend = new int[n];
        for (int friend = 1; friend <= n; friend++) {
            int giftReceiver = in.nextInt();
            whoGaveGiftToFriend[giftReceiver - 1] = friend;
        }
        String output = Arrays.stream(whoGaveGiftToFriend)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(output);
    }
}
