import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StacksAndQueues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        List<Integer> inputData = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (Integer number: inputData) {
            numbers.push(number);

        }
        while(!numbers.isEmpty()){
            System.out.print(numbers.pop()+" ");
        }

    }

}
