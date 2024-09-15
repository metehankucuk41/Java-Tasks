import java.util.ArrayList;
import java.util.Arrays;

/**
 * The StudentManagementTest class tests the functionality of the StudentManagement system
 * by adding, searching, deleting, and retrieving student data.
 */
public class StudentManagementTest {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student student1 = new Student(203,"Ali","Bozkurt", 20,'M');
        Student student2 = new Student(403,"Ayşe","Kurt", 25,'F');
        Student student3 = new Student(526,"Beril","Akarsu",19,'F');
        Student student4 = new Student(102,"Ali","Kurt", 30,'M');
        Student student5 = new Student(304,"Atlas","Karagöz", 40,'M');
        Student student6 = new Student(502, "Zeynep", "Polat", 22, 'F');
        Student student7 = new Student(605, "Ahmet", "Kaya", 24, 'M');
        Student student8 = new Student(107, "Abdullah", "Yılmaz", 28, 'M');
        Student student9 = new Student(348, "Osman", "Arslan", 22, 'M');
        Student student10 = new Student(349, "Mert", "Çetin", 28, 'M');

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
        sm.addAllStudents(students);

        sm.getAllStudents();

        sm.deleteAllStudents();

        sm.addStudent(student1);
        sm.addStudent(student2);
        sm.addStudent(student3);

        ArrayList<Student> students2 = new ArrayList<>(Arrays.asList(student4, student5, student6, student7, student8,
                student9));

        System.out.println("Test");
        sm.searchStudentWithName("Ali");

        sm.deleteStudentWithId(526);

        sm.getAllStudents();


        System.out.println("Test");

        sm.getStudentWithId(605);

        System.out.println("Test");

        sm.addStudent(student10);

        sm.getAllStudents();


    }
}
