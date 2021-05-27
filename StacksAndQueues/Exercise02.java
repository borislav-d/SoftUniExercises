import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parentheses = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String lookupTable = "({[";

        boolean areBalanced = true;

        for (int i = 0; i <parentheses.length() ; i++) {
            char symbol = parentheses.charAt(i);

            if (lookupTable.contains(symbol + "")){
                stack.push(symbol);
            }else{
                if (stack.isEmpty()){
                    areBalanced= false;
                    break;
                }
                char top = stack.pop();

                if (!(top=='(' && symbol== ')'
                        || top=='[' && symbol== ']'
                        || top=='{' && symbol== '}')) {
                    areBalanced= false;
                }
            }
        }

        String output = areBalanced ? "YES" : "NO";
        System.out.println(output);
        
    }
}
