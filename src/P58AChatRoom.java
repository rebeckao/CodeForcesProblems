import java.util.Scanner;

public class P58AChatRoom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] vasyasWord = in.nextLine().toCharArray();
        char[] helloWord = new char[]{'h', 'e', 'l', 'l', 'o'};
        int helloLetterIndex = 0;

        for (char letter : vasyasWord) {
            if (letter == helloWord[helloLetterIndex]) {
                helloLetterIndex++;
                if (helloLetterIndex == helloWord.length) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
