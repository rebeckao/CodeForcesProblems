import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P268AGames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfTeams = in.nextInt();

        List<Integer> hostUniforms = new ArrayList<>();
        List<Integer> guestUniforms = new ArrayList<>();
        for (int i = 0; i < numberOfTeams; i++) {
            hostUniforms.add(in.nextInt());
            guestUniforms.add(in.nextInt());
        }

        int hostsPlayingWithGuestUniforms = 0;

        for (Integer hostUniform : hostUniforms) {
            for (Integer guestUniform : guestUniforms) {
                if (hostUniform.equals(guestUniform)) {
                    hostsPlayingWithGuestUniforms++;
                }
            }
        }

        System.out.println(hostsPlayingWithGuestUniforms);
    }
}
