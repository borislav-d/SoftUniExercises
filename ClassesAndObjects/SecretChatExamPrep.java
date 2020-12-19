import java.util.*;

public class SecretChatExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialMessage = scanner.nextLine();

        String command = scanner.nextLine();

        StringBuilder result = new StringBuilder(initialMessage);
        while (!"Reveal".equals(command)) {

            command = scanner.nextLine();


            System.out.println("You have a new message: " + result);
            String[] tokens = command.split(":\\|:");
            String commandName = tokens[0];

            switch (commandName) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    result.insert(index, " ");

                    break;
                case "Reverse":
                    String search = tokens[1];
                    int searchingIndex = result.indexOf(search);
                    if (searchingIndex >= 0) {
                        result.delete(searchingIndex, searchingIndex + search.length());
                        String reversed = new StringBuilder(search).reverse().toString();
                        result.append(reversed);

                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String find = tokens[1];
                    String replace = tokens[2];
                    String replaced = result.toString().replace(find, replace);
                    result = new StringBuilder(replaced);

                    break;

            }
        }
    }

}
