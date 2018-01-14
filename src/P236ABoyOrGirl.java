import java.util.Scanner;

public class P236ABoyOrGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();

        if (userName.chars().distinct().count() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
