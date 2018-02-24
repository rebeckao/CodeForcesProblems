import java.util.Scanner;

public class P510AFoxAndSnake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int columns = in.nextInt();

        String horizontalSnake = new String(new char[columns]).replace('\0', '#');
        String dots = new String(new char[columns - 1]).replace('\0', '.');
        String rightSnake = dots + "#";
        String leftSnake = "#" + dots;

        String[] snakeParts = new String[]{horizontalSnake, rightSnake, horizontalSnake, leftSnake};

        for (int row = 0; row < rows; row++) {
            System.out.println(snakeParts[row % 4]);
        }
    }
}
