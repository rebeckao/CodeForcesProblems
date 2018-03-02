import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Template {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<String> values = Arrays.stream(in.nextLine().split(" "))
                .collect(Collectors.toList());


        System.out.println();
    }
}
