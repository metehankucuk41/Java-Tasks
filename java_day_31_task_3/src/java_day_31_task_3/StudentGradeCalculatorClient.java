package java_day_31_task_3;
import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculatorClient 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] students = new String[numberOfStudents];
        System.out.print("Do you want to enter student names? (yes/no): ");
        String studentResponse = scanner.nextLine();
        if (studentResponse.equalsIgnoreCase("yes")) 
        {
            for (int i = 0; i < numberOfStudents; i++) 
            {
                System.out.print("Enter name for student " + (i + 1) + ": ");
                students[i] = scanner.nextLine();
            }
        } 
        else 
        {
            for (int i = 0; i < numberOfStudents; i++) 
            {
                students[i] = "Student-" + (i + 1);
            }
        }

        System.out.print("Enter the number of courses: ");
        int numberOfCourses = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] courses = new String[numberOfCourses];
        System.out.print("Do you want to enter course names? (yes/no): ");
        String courseResponse = scanner.nextLine();
        if (courseResponse.equalsIgnoreCase("yes")) 
        {
            for (int i = 0; i < numberOfCourses; i++) 
            {
                System.out.print("Enter name for course " + (i + 1) + ": ");
                courses[i] = scanner.nextLine();
            }
        } 
        else 
        {
            courses[0] = "Math";
            courses[1] = "Chemistry";
            courses[2] = "History";
            courses[3] = "Physical Education";
            for (int i = 4; i < numberOfCourses; i++) 
            {
                courses[i] = "Course-" + (i + 1);
            }
        }

        int[][] grades = StudentGradeCalculator.generateGrades(numberOfStudents, numberOfCourses);

        printGrades(students, courses, grades);

        boolean control = true;
        while (control) 
        {
        	System.out.println();
            System.out.println("To learn a student's overall grade point average, press 1.");
            System.out.println("To learn the overall grade point average of a course, press 2.");
            System.out.println("To learn a student's grade in any course, press 3.");
            System.out.println("To exit, press 4.");
            
            System.out.print("Please enter the action you want to perform: ");

            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) 
            {
                case 1:
                    System.out.print("Please enter a student name: ");
                    String studentName = scanner.nextLine();
                    int studentIndex = findIndex(studentName, students);
                    if (studentIndex != -1) 
                    {
                        int grade = StudentGradeCalculator.calculateStudentGrade(studentIndex, grades);
                        System.out.println(studentName + "'s grade: " + grade);
                    } 
                    else 
                    {
                        System.out.println("Student not found!");
                    }
                    break;

                case 2:
                    System.out.print("Please enter a course name: ");
                    String courseName = scanner.nextLine();
                    int courseIndex = findIndex(courseName, courses);
                    if (courseIndex != -1) 
                    {
                        int average = StudentGradeCalculator.calculateCourseAverage(courseIndex, grades);
                        System.out.println("Overall grade point average of " + courseName + " course: " + average);
                    } 
                    else 
                    {
                        System.out.println("Course not found!");
                    }
                    break;

                case 3:
                	
                    System.out.print("Please enter a student name: ");
                    studentName = scanner.nextLine();
                    
                    System.out.print("Please enter a course name: ");
                    courseName = scanner.nextLine();

                    studentIndex = findIndex(studentName, students);
                    courseIndex = findIndex(courseName, courses);

                    if (studentIndex != -1 && courseIndex != -1) 
                    {
                        System.out.println(studentName + "'s " + courseName + " grade: " + grades[studentIndex][courseIndex]);
                    } 
                    else 
                    {
                        System.out.println("Student or course not found!");
                    }
                    break;

                case 4:
                    control = false;
                    break;

                default:
                    System.out.println("Please enter a valid transaction!");
            }
        }

        scanner.close();
    }

    private static int findIndex(String name, String[] array) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i].equalsIgnoreCase(name)) 
            {
                return i;
            }
        }
        return -1;
    }

    private static void printGrades(String[] students, String[] courses, int[][] grades) 
    {
        System.out.print("          ");
        for (String course : courses) 
        {
            System.out.print(course + " ");
        }
        System.out.println();

        for (int i = 0; i < students.length; i++) 
        {
            System.out.print(students[i] + ": ");
            for (int j = 0; j < courses.length; j++) 
            {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}