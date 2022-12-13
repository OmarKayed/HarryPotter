public class Person {
    String firstName;
    String lastName;
    int point;

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.point = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", point=" + point +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPoint() {
        return point;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int addPoints(int point) {
        return this.point += point;
    }

    }

