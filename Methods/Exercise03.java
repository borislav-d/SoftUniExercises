import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] field = {2, 20, 3, 13, 15, 3, 9, 10, 1, 5, 8};

        int counter= 0;
        for (int i = 0; i <field.length ; i++) {
            if (field[i]%2 !=0){
                counter++;
                System.out.println(counter);

            }

        }
    }
}
