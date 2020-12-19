import java.util.*;

public class CharacterMultiplier {
    //Create a method that takes two strings as arguments and returns the sum of their character codes multiplied...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];

        int min = Integer.min(first.length(), second.length());
        int max = Integer.max(first.length(), second.length());

        int result = 0;

        for (int i = 0; i < max; i++) {
            if (i<min){
                result+= first.charAt(i) * second.charAt(i);

            }else if (first.length() == max){
                result += first.charAt(i);

            }else{
                result += second.charAt(i);

            }
            
        }
        System.out.println(result);
    }
}
