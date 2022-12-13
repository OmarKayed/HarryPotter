
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Harry", "Potter");
        Person person2 = new Person("Ron", "Weasly");
        Person person3 = new Person("Hermione", "Granger");
        Person person4 = new Person("Ginny", "Weasly");

        person1.addPoints(100);
        person2.addPoints(231);
        person3.addPoints(420);
        person4.addPoints(1000);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        // Made an array with 3 different characters
        Person [] listOfStudents ={new Person("Harry", "Potter"),
                new Person("Ron", "Weasly"),
                new Person("Hermione", "Granger")};

        Person [] people = new Person[5];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;


        // Made so the array can be printed with toString for Arrays
        System.out.println(Arrays.toString(listOfStudents));

        for (Person listOfStudent : listOfStudents) {
            System.out.println(listOfStudent);
        }





    }
}
