import java.util.Scanner;

public class P466ACheapTravel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfRides = in.nextInt();
        int ridesInSpecialTicket = in.nextInt();
        int costOfSingleRide = in.nextInt();
        int costOfSpecialTicket = in.nextInt();

        if (costOfSpecialTicket/((double) ridesInSpecialTicket) > costOfSingleRide) {
            System.out.println(numberOfRides * costOfSingleRide);
            return;
        }

        int numberOfSpecialTickets = numberOfRides / ridesInSpecialTicket;
        int additionalRides = numberOfRides % ridesInSpecialTicket;
        int costOfAdditionalRides = Math.min(additionalRides * costOfSingleRide, costOfSpecialTicket);

        int cost = numberOfSpecialTickets * costOfSpecialTicket + costOfAdditionalRides;

        System.out.println(cost);
    }
}
