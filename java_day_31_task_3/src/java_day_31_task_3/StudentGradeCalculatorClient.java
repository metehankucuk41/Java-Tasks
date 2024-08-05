package java_day_31_task_3;

import java.util.Scanner;

public class StudentGradeCalculatorClient 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        
        System.out.print("Please enter the number of students. (Press -1 for it to be created automatically.): ");
        int numberOfStudents = scanner.nextInt();
        
        System.out.print("Please enter the number of courses. (Press -1 for it to be created automatically.): ");
        int numberOfCourses = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Will you enter student names manually? (yes/no): ");
        boolean studentNamesAuto = !scanner.nextLine().equalsIgnoreCase("yes");
        
        System.out.print("Will you enter course names manually? (yes/no): ");
        boolean courseNamesAuto = !scanner.nextLine().equalsIgnoreCase("yes");
        
        calculator.initialize(numberOfStudents, numberOfCourses, studentNamesAuto, courseNamesAuto);
        calculator.showArrays();
        
        boolean control = true;
        while (control)
        {
            transactionMenu();
            int transaction = scanner.nextInt();
            scanner.nextLine();
            String studentName, courseName;
            switch(transaction)
            {
                case 1:
                    System.out.print("Type which student's GPA you want to know: ");
                    studentName = scanner.nextLine();
                    System.out.println(studentName + "'s GPA: " + calculator.AnyStudentsGrade(studentName));
                    break;
                    
                case 2:
                    System.out.print("Type the GPA of which course you want to know: ");
                    courseName = scanner.nextLine();
                    System.out.println("GPA of the " + courseName + " course: " + calculator.AnyCourseAverageGrade(courseName));
                    break;
                    
                case 3:
                    System.out.print("Type the grade total for which course you want to know: ");
                    courseName = scanner.nextLine();
                    System.out.println("Total grade of the " + courseName + " course: " + calculator.AnyCourseTotalGrade(courseName));
                    break;
                    
                case 4:
                    System.out.print("Enter the course name: ");
                    courseName = scanner.nextLine();
                    
                    System.out.print("Enter the student name: ");
                    studentName = scanner.nextLine();
                    
                    System.out.println(studentName + "'s " + courseName + " course grade: " + calculator.AnyStudentsAnyCourseGrade(studentName, courseName));
                    break;
                    
                case 5:
                    scanner.close();
                    control = false;
                    break;
                    
                default:
                    System.out.println("Please enter a valid transaction!");
                    break;
            }
        }
    }
    
    public static void transactionMenu()
    {
        System.out.println();
        System.out.println("To learn a student's overall grade point average, press 1.");
        System.out.println("To learn the overall grade point average of a course, press 2.");
        System.out.println("To learn the overall grade total for a course, press 3.");
        System.out.println("To learn a student's grade in any course, press 4.");
        System.out.println("To exit, press 5.");
        System.out.print("Please enter the action you want to perform: ");
    }
}