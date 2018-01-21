import java.util.Scanner;

public class P271ABeautifulYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        year++;

        while (!isBeautifulYear(year)) {
            year++;
        }

        System.out.println(year);
    }

    private static boolean isBeautifulYear(int year) {
        String yearString = String.valueOf(year);
        long distinctDigits = yearString.chars().distinct().count();
        return distinctDigits == yearString.length();
    }
}
