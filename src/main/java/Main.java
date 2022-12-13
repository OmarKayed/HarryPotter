
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Harry", "Potter");
        Person person2 = new Person("Ron", "Weasly");
        Person person3 = new Person("Hermione", "Granger");

        person1.addPoints(100);
        person2.addPoints(231);
        person3.addPoints(420);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);



        // Made an array with 3 different characters
        Person [] listOfStudents ={new Person("Harry", "Potter"),
                new Person("Ron", "Weasly"),
                new Person("Hermione", "Granger")};

        // Made so the array can be printed with toString for Arrays
        System.out.println(Arrays.toString(listOfStudents));

        for (Person listOfStudent : listOfStudents) {
            System.out.println(listOfStudent);
        }





    }
}
