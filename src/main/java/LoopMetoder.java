import java.util.ArrayList;

public class LoopMetoder {
    public int calculateTotalPoints (ArrayList<Person> people) {
       int totalPoint = 0;
       for (Person person : people) {
           totalPoint += person.getPoint();
       } return totalPoint;
    }

    // A method to find the student with the minimum points
    public Person findMinimum (ArrayList<Person> people) {
        Person minimum = people.get(0);

        for (Person person : people) {
            if (person.getPoint() < minimum.getPoint()) {
                minimum = person;
            }
        } return minimum;
    }

    // A method to find the student with the maximum points
    public Person findMaximum (ArrayList<Person> people) {
        Person maximum = people.get(0);

        for (Person person : people) {
            if (person.getPoint() > maximum.getPoint()) {
                maximum = person;
            }
        } return maximum;
    }
    // A method to find the average points between all students
    public int calculateAverage(ArrayList<Person> people) {
       int total = calculateTotalPoints(people);
       int averagePoints = total / people.size();

       return averagePoints;
    }

    public Person findByFirstName (ArrayList<Person> people, String searchTerm) {
        Person studentFirstName = null;
        for (Person person : people) {
            if (searchTerm.contains(person.getFirstName())) {
                studentFirstName = person;
            }
        } return studentFirstName;
    }

    public Person findByLastName (ArrayList<Person> people, String searchTerm) {
        Person studentLastName = null;
        for (Person person : people) {
            if (searchTerm.contains(person.getLastName())) {
                studentLastName = person;
            }
        } return studentLastName;

    }

    public Person findName (ArrayList<Person> people, String searchTerm) {
        Person studentName = null;
        for (Person person : people) {
            if (searchTerm.contains(person.getFirstName() + " " + person.getLastName()));
            studentName = person;
        } return studentName;
    }

}
