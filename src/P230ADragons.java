import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P230ADragons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int strength = in.nextInt();
        int numberOfDragons = in.nextInt();
        List<Dragon> hereBeDragons = new ArrayList<>();

        for (int currentDragon = 0; currentDragon < numberOfDragons; currentDragon++) {
            hereBeDragons.add(new Dragon(in.nextInt(), in.nextInt()));
        }

        List<Dragon> dragonForce = hereBeDragons.stream()
                .sorted(Comparator.comparingInt(dragon -> dragon.strength))
                .collect(Collectors.toList());

        for (Dragon dragon : dragonForce) {
            if (strength > dragon.strength) {
                strength += dragon.gain;
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    private static class Dragon {
        final int strength;
        final int gain;

        Dragon(int strength, int gain) {
            this.strength = strength;
            this.gain = gain;
        }
    }
}
