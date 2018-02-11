import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P25AIQTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (in.nextInt() % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        int differentIndex = (evens.size() == 1) ?
                evens.get(0) :
                odds.get(0);
        System.out.println(differentIndex);
    }
}
