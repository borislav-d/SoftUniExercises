import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // fibonacci(n) = fibonacci(n-1) + fibonacci (n-2);

        long result = fibonacci(n);

    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return 1;

        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
