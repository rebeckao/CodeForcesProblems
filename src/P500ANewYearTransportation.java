import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P500ANewYearTransportation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = in.nextInt();
        in.nextLine();

        List<Integer> portalRanges = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int currentCell = 1;
        while (currentCell <= t) {
            if (currentCell == t) {
                System.out.println("YES");
                return;
            }
            int nextPortalRange = portalRanges.get(currentCell - 1);
            currentCell += nextPortalRange;
        }

        System.out.println("NO");
    }
}
