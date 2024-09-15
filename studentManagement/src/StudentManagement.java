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
        students = new ArrayList<>();
    }

    /**
     * Adds a single student to the list.
     *
     * @param student the student to add
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Adds multiple students to the list.
     *
     * @param newStudents the list of students to add
     */
    public void addAllStudents(ArrayList<Student> newStudents) {
        students.addAll(newStudents);
    }

    /**
     * Deletes a student by their ID.
     *
     * @param studentId the ID of the student to be deleted
     */
    public void deleteStudentWithId(int studentId) {
        int index = findIndexOfStudent(studentId);
        if (index != -1) {
            students.remove(index);
        } else {
            System.out.println("Student not found");
        }
    }

    /**
     * Finds the index of a student by their ID.
     *
     * @param studentId the ID of the student to find
     * @return the index of the student in the list, or -1 if not found
     */
    public int findIndexOfStudent(int studentId) {
        for (Student student : students) {
            if (student.id == studentId) {
                return students.indexOf(student);
            }
        }
        return -1;
    }

    /**
     * Deletes all students from the list.
     */
    public void deleteAllStudents() {
        students.clear();
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

        if (searchedStudents.size() > 0) {
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
        for (Student student : students) {
            System.out.println(student);
            System.out.println();
        }
    }
}