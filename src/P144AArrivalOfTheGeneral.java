import java.util.*;

public class P144AArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfSoldiers = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        String[] soldiersAsStrings = input.split(" ");

        OptionalInt tallestSoldierHeight = Arrays.stream(soldiersAsStrings).mapToInt(Integer::parseInt).max();
        OptionalInt shortestSoldierHeight = Arrays.stream(soldiersAsStrings).mapToInt(Integer::parseInt).min();

        List<String> soldierList = Arrays.asList(soldiersAsStrings);
        int tallestSoldierIndex = soldierList.indexOf(getAsString(tallestSoldierHeight));
        int shortestSoldierIndex = soldierList.lastIndexOf(getAsString(shortestSoldierHeight));

        int swapsOnShortestSoldier = (numberOfSoldiers - 1) - shortestSoldierIndex;
        int swapsOnTallestSoldier = tallestSoldierIndex;
        int minimumNumberOfSwaps = swapsOnTallestSoldier + swapsOnShortestSoldier;

        if (tallestSoldierIndex > shortestSoldierIndex) {
            minimumNumberOfSwaps--;
        }

        System.out.println(minimumNumberOfSwaps);
    }

    @SuppressWarnings({"OptionalUsedAsFieldOrParameterType", "ConstantConditions"})
    private static String getAsString(OptionalInt tallestSoldierHeight) {
        return String.valueOf(tallestSoldierHeight.getAsInt());
    }
}
