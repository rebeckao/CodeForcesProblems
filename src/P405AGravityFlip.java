import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P405AGravityFlip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(in.nextInt());
        }

        String sorted = values.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(sorted);
    }
}
