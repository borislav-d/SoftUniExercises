import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        sumTheNums(firstNum, secondNum);

    }

    public static void sumTheNums(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
//        return sumTheNums(a, b);
    }

    public static void extractTheNums(int c, int d) {


    }
}
