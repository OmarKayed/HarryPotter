
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Harry", "Potter", 100);
        Person person2 = new Person("Ron", "Weasly", 231);
        Person person3 = new Person("Hermione", "Granger",420);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        Person [] listOfStudents ={new Person("Harry", "Potter", 100),
                new Person("Ron", "Weasly", 231),
                new Person("Hermione", "Granger",420)};

        System.out.println(Arrays.toString(listOfStudents));



    }
}
