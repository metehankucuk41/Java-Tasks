/**
 * The Student class represents a student with an ID, first name, last name, age, and gender.
 */
public class Student {
    int id;
    String firstName;
    String lastName;
    int age;
    char gender;

    /**
     * Constructor to initialize a Student object.
     *
     * @param id        the ID of the student
     * @param firstName the first name of the student
     * @param lastName  the last name of the student
     * @param age       the age of the student
     * @param gender    the gender of the student ('M' for male, 'F' for female)
     */
    public Student(int id, String firstName, String lastName, int age, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    /**
     * The Student class represents a student with an ID, first name, last name, age, and gender.
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
