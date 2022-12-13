public class LoopMetoder {
    public int calculateTotalPoints (Person [] people) {
       int totalPoint = 0;
       for (Person person : people) {
           totalPoint += person.getPoint();
       } return totalPoint;
    }

    // A method to find the student with the minimum points
    public Person findMinimum (Person [] people) {
        Person minimum = people[0];

        for (Person person : people) {
            if (person.getPoint() < minimum.getPoint()) {
                minimum = person;
            }
        } return minimum;
    }

    // A method to find the student with the maximum points
    public Person findMaximum (Person [] people) {
        Person maximum = people[0];

        for (Person person : people) {
            if (person.getPoint() > maximum.getPoint()) {
                maximum = person;
            }
        } return maximum;
    }
    // A method to find the average points between all students
    public int calculateAverage(Person [] people) {
       int total = calculateTotalPoints(people);
       int averagePoints = total / people.length;

       return averagePoints;
    }

}
