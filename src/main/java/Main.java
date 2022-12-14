
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        LoopMetoder loopMetoder = new LoopMetoder();

        Person person1 = new Person("Harry", "Potter");
        Person person2 = new Person("Ron", "Weasly");
        Person person3 = new Person("Hermione", "Granger");
        Person person4 = new Person("Ginny", "Weasly");
        Person person5 = new Person("Draco", "Malfoy");
        Person person6 = new Person("Neville", "Longbottom");

        person1.addPoints(100);
        person2.addPoints(231);
        person3.addPoints(420);
        person4.addPoints(1000);
        person5.addPoints(215);
        person6.addPoints(7);

        System.out.println("The first person is;" + person1);
        System.out.println("The second person is:" + person2);
        System.out.println(" The third person is:" + person3);

        // Made an array with 3 different characters
        Person [] listOfStudents ={new Person("Harry", "Potter"),
                new Person("Ron", "Weasly"),
                new Person("Hermione", "Granger")};

        ArrayList <Person> people = new ArrayList<>();
        Collections.addAll(people, person1, person2, person3, person4, person5, person6);

        // Printed the list after number = 0 is where the array starts - Also made so Array can be printed with an built toString
        System.out.println(people);

        for (Person listOfStudent : listOfStudents) {
            System.out.println(listOfStudent);
        }

        int totalPoints = loopMetoder.calculateTotalPoints(people);

        System.out.println("The total points are: " + totalPoints);

        Person findMinimum = loopMetoder.findMinimum(people);

        System.out.println("The person with the lowest points: " + findMinimum);

        Person findMaximum = loopMetoder.findMaximum(people);

        System.out.println("The person with the highest points is: " + findMaximum);

        int calculateAverage = loopMetoder.calculateAverage(people);

        System.out.println("The average points for all the students combined is: " + calculateAverage);

        Person findByFirstName = loopMetoder.findByFirstName(people, "Harry");

        System.out.println(findByFirstName.getFirstName() + " " + findByFirstName.getLastName());

        Person findByLastName = loopMetoder.findByLastName(people,"Potter");

        System.out.println(findByLastName.getFirstName()+ " " + findByLastName.getLastName());

        Person findByName = loopMetoder.findName(people, "Harry Potter");

        System.out.println(findByName.getFirstName()+ " " + findByName.getLastName());





    }
}
