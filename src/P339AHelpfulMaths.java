import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P339AHelpfulMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputSum = in.nextLine();

        String outputSum = Arrays
                .stream(inputSum.split("\\+"))
                .sorted()
                .collect(Collectors.joining("+"));

        System.out.println(outputSum);
    }
}
