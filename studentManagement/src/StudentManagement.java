import java.util.ArrayList;

/**
 * The StudentManagement class manages a list of students with functionalities to add, delete,
 * and search students.
 */
public class StudentManagement {
    ArrayList<Student> students;

    /**
     * Constructor to initialize the student management system.
     */
    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    /**
     * Adds a single student to the list.
     *
     * @param student the student to add
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /**
     * Adds multiple students to the list.
     *
     * @param students the list of students to add
     */
    public void addAllStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }

    /**
     * Deletes a student by their ID.
     *
     * @param studentId the ID of the student to be deleted
     */
    public void deleteStudentWithId(int studentId) {
        this.students.removeIf(student -> student.id == studentId);
    }



    /**
     * Deletes all students from the list.
     */
    public void deleteAllStudents() {
        this.students.clear();
    }

    /**
     * Searches for students by their first name (case insensitive).
     *
     * @param firstName the first name to search for
     */
    public void searchStudentWithName(String firstName) {
        ArrayList<Student> searchedStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.firstName.equalsIgnoreCase(firstName)) {
                searchedStudents.add(student);
            }
        }

        if (!searchedStudents.isEmpty()) {
            for (Student student : searchedStudents) {
                System.out.println(student);
            }
        } else {
            System.out.println("Student not found");
        }
    }

    /**
     * Retrieves and prints a student by their ID.
     *
     * @param studentId the ID of the student to retrieve
     */
    public void getStudentWithId(int studentId) {
        boolean found = false;
        for (Student student : students) {
            if (student.id == studentId) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }

    }

    /**
     * Retrieves and prints all students in the list.
     */
    public void getAllStudents() {
        if (this.students.isEmpty()) {
            System.out.println("Student not found");
        } else {
            System.out.println(students);
        }
    }

    @Override
    public String toString() {
        return "StudentManagement{" +
                "students=" + students +
                '}';
    }
}