import java.util.*;
import java.util.stream.Collectors;

public class P122ALuckyDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();

        int length = number.toString().length();
        List<Integer> luckyNumbers = getAllLuckyNumbersUpToLength(length);

        for (Integer luckyNumber : luckyNumbers) {
            if (number % luckyNumber == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    private static List<Integer> getAllLuckyNumbersUpToLength(int length) {
        List<String> previousNumbers = Arrays.asList("4", "7");
        ArrayList<String> luckyNumbers = new ArrayList<>(previousNumbers);

        for (int i = 2; i <= length; i++) {
            List<String> numbersWithOneMoreDigit = getLuckyNumbersWithOneMoreDigit(previousNumbers);
            luckyNumbers.addAll(numbersWithOneMoreDigit);
            previousNumbers = numbersWithOneMoreDigit;
        }

        return luckyNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static List<String> getLuckyNumbersWithOneMoreDigit(List<String> previousNumbers) {
        return previousNumbers
                .stream()
                .map(number -> Arrays.asList("4" + number, "7" + number))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

}
