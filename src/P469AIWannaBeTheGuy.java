import java.util.*;

public class P469AIWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfLevels = in.nextInt();
        Set<Integer> cooperatedLevels = new HashSet<>();

        int numberOfLittleXLevels = in.nextInt();
        for (int x = 0; x < numberOfLittleXLevels; x++) {
            cooperatedLevels.add(in.nextInt());
        }

        int numberOfLittleYLevels = in.nextInt();
        for (int y = 0; y < numberOfLittleYLevels; y++) {
            cooperatedLevels.add(in.nextInt());
        }

        if (cooperatedLevels.size() == numberOfLevels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
