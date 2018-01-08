import java.util.Arrays;
import java.util.Scanner;

public class P158BTaxi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.nextLine();

        String groupSizes = in.nextLine();
        int[] groupsWithSize = new int[]{0, 0, 0, 0};
        Arrays.stream(groupSizes.split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(groupSize -> groupsWithSize[indexOfGroupSize(groupSize)]++);

        int numberOfTaxis = groupsWithSize[indexOfGroupSize(4)];

        int groupsWithSize3 = groupsWithSize[indexOfGroupSize(3)];
        numberOfTaxis += groupsWithSize3;
        groupsWithSize[indexOfGroupSize(1)] = Math.max(0, groupsWithSize[indexOfGroupSize(1)] - groupsWithSize3);

        int groupsWithSize2 = groupsWithSize[indexOfGroupSize(2)];
        numberOfTaxis += groupsWithSize2 / 2;
        if (groupsWithSize2 % 2 == 1){
            numberOfTaxis++;
            groupsWithSize[indexOfGroupSize(1)] = Math.max(0, groupsWithSize[indexOfGroupSize(1)] - 2);
        }

        numberOfTaxis += Math.ceil(groupsWithSize[indexOfGroupSize(1)]/4.0);

        System.out.println(numberOfTaxis);
    }

    private static int indexOfGroupSize(int groupSize) {
        return groupSize - 1;
    }
}
