import java.util.Scanner;

public class P236ABeautifulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rowIndex, columnIndex = 0;
        outerloop:
        for (rowIndex = 1; rowIndex <= 5; rowIndex++) {
            for (columnIndex = 1; columnIndex <= 5; columnIndex++) {
                if (in.nextInt() == 1) {
                    break outerloop;
                }
            }
        }

        int distanceToMiddle = Math.abs(rowIndex - 3) + Math.abs(columnIndex - 3);
        System.out.println(distanceToMiddle);
    }
}
