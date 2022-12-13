public class LoopMetoder {
    public int calculateTotalPoints (Person [] people) {
       int totalPoint = 0;
       for (Person person : people) {
           totalPoint += person.getPoint();
       } return totalPoint;
    }

    public Person findMinimum (Person [] people) {
        Person minimum = people[0];

        for (Person person : people) {
            if (person.getPoint() < minimum.getPoint()) {
                minimum = person;
            }
        } return minimum;
    }

    public Person findMaximum (Person [] people) {
        Person maximum = people[0];

        for (Person person : people) {
            if (person.getPoint() > maximum.getPoint()) {
                maximum = person;
            }
        } return maximum;
    }

}
