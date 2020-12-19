import java.util.*;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List <Person> allPeople = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);

            allPeople.add(person);

            //allPeople.stream().filter(person-> person.getAge()>30).sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(person -> System.out.println(person.toString()));

        }




    }
    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public String toString(){
            return String.format("%s-%d",getName(),getAge());

        }
    }

}
