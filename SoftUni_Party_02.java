import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUni_Party_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> quest = new TreeSet<>();


        String reservationNumber = scanner.nextLine();

        while (!reservationNumber.equals("PARTY")) {

           quest.add(reservationNumber);

            reservationNumber = scanner.nextLine();
        }

        String questReservation = scanner.nextLine();

        while (!questReservation.equals("END")){
        quest.remove(questReservation);

            questReservation = scanner.nextLine();
        }

        System.out.println(quest.size());

        System.out.println(String.join(System.lineSeparator(),quest));
    }
}
