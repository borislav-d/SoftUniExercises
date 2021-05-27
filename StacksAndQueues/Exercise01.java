import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" +"))
                .forEach(stack::push);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()+ " ");
            
        }
    }
}
