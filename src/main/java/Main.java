
import java.util.Arrays;

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

        // Array can now hold 5 people
        Person [] people = new Person[5];
        people[0] = person1;
        people[2] = person2;
        people[3] = person3;
        people[1] = person4;
        people[4] = person5;
        people[4] = person6;

        // Printed the list after number = 0 is where the array starts - Also made so Array can be printed with an built toString
        System.out.println(Arrays.toString(people));

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





    }
}
