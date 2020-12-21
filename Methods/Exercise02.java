import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first < second) {
            printSymbolsInRange(first, second);
        } else {
            printSymbolsInRange(second, first);

        }

    }

    public static void printSymbolsInRange(char start, char stop) {
        for (char i = ++start; i < stop; i++) {
            System.out.printf("%c" + " ", i);


        }
    }

}
