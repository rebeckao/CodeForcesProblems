import java.util.Scanner;

public class P266BQueueAtTheSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = in.nextInt();
        in.nextLine();
        String queue = in.nextLine();

        for (int i = 0; i < t; i++) {
            queue = queue.replaceAll("BG","GB");
        }

        System.out.println(queue);
    }
}