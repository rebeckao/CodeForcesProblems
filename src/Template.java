import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(in.nextInt());
        }

        System.out.println();
    }
}
