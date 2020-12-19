import java.util.Scanner;

public class ClassesAndObjectsIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student studentOne = new Student("Kaloyan", "Kostadinov", 5.75); // получава данните от конструктора
        // може да си принти или с метода стюдънтИнфо или с гетърите
        System.out.println(studentOne.studentInfo());
        System.out.println();

        Student studentTwo = new Student("Borislav", "Dimitrov", 6.00); // получава данните от конструктора

        System.out.println(studentTwo.studentInfo());


    }

}

class Student { //прави се клас, в който се описват променливи или се прави конструктор. Върши повтаряща се работа в целия мейн метод
    String firstName;
    String lastName;
    double averageScore;

    Student(String fName, String lName, double avgScore) { // конструктор
        firstName = fName;
        lastName = lName;
        averageScore = avgScore;



    }
    // гетърите спомагат достъпването на променливата в мейн метода
    public String getFirstName() {
        return firstName;
    }
// сетърите помагат в мейна да се добавя друга стойност на променливата
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;

    }
        // с този метод събираме всички гетъри, за да улесним принтирането в мейна
    public String studentInfo(){
        String message = String.format("First name: %s%n last name: %s%n average score %.2f",
                getFirstName(),getLastName(),getAverageScore()
);

        return message;
    }
}
