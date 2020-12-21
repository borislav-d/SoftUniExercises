import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLineLength = new Scanner (System.in).nextInt();

        for (int i = 1; i <= maxLineLength ; i++) {
        printLineOfNumbersIncreasing(i);

        }
        for (int i = maxLineLength; i >= 1  ; i--) {
        printLineOfNumbersIncreasing(i);

        }
    }

    private static void printLineOfNumbersIncreasing(int maxNumber) {
        for (int i = 1; i <= maxNumber ; i++) {
            System.out.print(i);
            if (i< maxNumber){
                System.out.print("");

            }
            System.out.println();

        }

    }
}
  