import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String commands = scanner.nextLine();
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = commands.split(" ");
            String guestName = tokens[0];

            if (!"not".equalsIgnoreCase(tokens[2])) {

                if (!guests.contains(guestName)) {
                    guests.add(guestName);

                } else {
                    System.out.printf("%s is already in the list!",guestName);


                }

            } else {
                if (guests.contains(guestName)) {
                    guests.remove(guestName);
                } else {
                    System.out.printf("%s is not in the list!",guestName);
                }
            }

        commands = scanner.nextLine();
        }
        for (String guest : guests) {
            System.out.println(guest);

        }
    }
}