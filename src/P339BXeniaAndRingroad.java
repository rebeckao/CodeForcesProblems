import java.util.Scanner;

public class P339BXeniaAndRingroad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfHouses = in.nextInt();
        int numberOfTasks = in.nextInt();

        int previousHouse = 1;
        int totalTime = 0;
        for (int i = 0; i < numberOfTasks; i++) {
            int nextHouse = in.nextInt();
            if (nextHouse > previousHouse) {
                totalTime += nextHouse - previousHouse;
            } else if (nextHouse < previousHouse) {
                totalTime += numberOfHouses - previousHouse + nextHouse;
            }
            previousHouse = nextHouse;
        }

        System.out.println(totalTime);
    }
}
