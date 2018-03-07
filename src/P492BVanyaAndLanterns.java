import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P492BVanyaAndLanterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.nextInt(); // numberOfLamps
        int lengthOfStreet = in.nextInt();
        in.nextLine();

        List<Integer> lanternLocations = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        Integer firstLanternLocation = lanternLocations.get(0);
        double longestRadius = firstLanternLocation;
        int previousLanternLocation = firstLanternLocation;

        for (Integer lanternLocation : lanternLocations) {
            longestRadius = Math.max(longestRadius, (lanternLocation - previousLanternLocation)/2.0);
            previousLanternLocation = lanternLocation;
        }

        longestRadius = Math.max(longestRadius, lengthOfStreet - previousLanternLocation);

        System.out.println(longestRadius);
    }
}
