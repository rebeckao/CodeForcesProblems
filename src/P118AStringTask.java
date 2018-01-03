import java.util.Scanner;

public class P118AStringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        String answer = input
                .toLowerCase()
                .replaceAll("[aoyeui]", "")
                .replaceAll("(.)", ".$1");

        System.out.println(answer);
    }
}
