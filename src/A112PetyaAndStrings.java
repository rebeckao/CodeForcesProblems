import java.util.Scanner;

public class A112PetyaAndStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string1 = in.nextLine().toLowerCase();
        String string2 = in.nextLine().toLowerCase();

        int lexicographicalDifference = string1.compareTo(string2);
        int comparisonValue = (int) Math.signum(lexicographicalDifference);
        System.out.println(comparisonValue);
    }
}
