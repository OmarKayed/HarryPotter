public class LoopMetoder {
    public int calculateTotalPoints (Person [] people) {
       int totalPoint = 0;
       for (Person person : people) {
           totalPoint += person.getPoint();
       } return totalPoint;
    }
}
