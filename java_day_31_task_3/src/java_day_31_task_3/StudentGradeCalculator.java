package java_day_31_task_3;

import java.util.Random;
import java.util.Scanner;

class StudentGradeCalculator 
{
    int numberOfStudents, numberOfCourses;
    
    boolean studentNamesAuto, courseNamesAuto;
    
    String[] defaultCourseNames = {"Algorithm and Programming", "Maths", "Physical Science", "Chemistry", "Biology", "English", "History"};
    String[] defaultStudentNames = {"Adam", "Joe", "Katty", "William", "Mary", "Jennifer", "Paticia"};
    
    String[] courseNames, studentNames;
    
    int[][] grades;
    
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    public void initialize(int numberOfStudents, int numberOfCourses, boolean studentNamesAuto, boolean courseNamesAuto) 
    {
    	
        this.numberOfStudents = (numberOfStudents == -1) ? random.nextInt(2, 7) : numberOfStudents;
        this.numberOfCourses = (numberOfCourses == -1) ? random.nextInt(2, 7) : numberOfCourses;
        
        this.studentNamesAuto = studentNamesAuto;
        this.courseNamesAuto = courseNamesAuto;
        
        createArrays();
    }
    
    private void createArrays()
    {
        courseNames = new String[numberOfCourses];
        studentNames = new String[numberOfStudents];
        
        grades = new int[studentNames.length][courseNames.length];
        
        if (studentNamesAuto)
        {
            for (int i = 0; i < studentNames.length; i++)
            {
                studentNames[i] = defaultStudentNames[i % defaultStudentNames.length];
            }
        }
        
        else
        {
            for (int i = 0; i < studentNames.length; i++)
            {
                System.out.print("Enter the name of student " + (i+1) + ": ");
                studentNames[i] = scanner.nextLine();
            }
        }
        
        if (courseNamesAuto)
        {
            for (int i = 0; i < courseNames.length; i++)
            {
                courseNames[i] = defaultCourseNames[i % defaultCourseNames.length];
            }
        }
        
        else
        {
            for (int i = 0; i < courseNames.length; i++)
            {
                System.out.print("Enter the name of course " + (i+1) + ": ");
                courseNames[i] = scanner.nextLine();
            }
        }
        
        for (int i = 0; i < studentNames.length; i++)
        {
            for (int j = 0; j < courseNames.length; j++)
            {
                grades[i][j] = random.nextInt(101);
            }
        }
    }
    
    public int AnyStudentsGrade(String studentName)
    {
        int studentIndex = findStudentIndex(studentName);
        
        if (studentIndex != -1)
        {
            int sum = 0;
            for (int i = 0; i < courseNames.length; i++)
            {
                sum += grades[studentIndex][i];
            }
            return sum / courseNames.length;
        }
        
        else
        {
            System.out.println("The student you were looking for was not found.");
            return -1;
        }
    }
    
    public int AnyCourseAverageGrade(String courseName)
    {
        int courseIndex = findCourseIndex(courseName);
        
        if (courseIndex != -1)
        {
            return AnyCourseTotalGrade(courseName) / studentNames.length;
        }
        
        else
        {
            System.out.println("Please enter a valid course name!");
            return -1;
        }
    }
    
    public int AnyCourseTotalGrade(String courseName)
    {
        int courseIndex = findCourseIndex(courseName);
        
        if (courseIndex != -1)
        {
            int sum = 0;
            for (int i = 0; i < studentNames.length; i++)
            {
                sum += grades[i][courseIndex];
            }
            return sum;
        }
        else
        {
            System.out.println("Please enter a valid course name!");
            return -1;
        }
    }
    
    public int AnyStudentsAnyCourseGrade(String studentName, String courseName)
    {
    	
        int studentIndex = findStudentIndex(studentName);
        int courseIndex = findCourseIndex(courseName);
        
        if (studentIndex != -1 && courseIndex != -1) 
        {
            return grades[studentIndex][courseIndex];
        }
        else 
        {
            System.out.println("Invalid student or course name.");
            return -1;
        }
    }
    
    private int findStudentIndex(String studentName)
    {
        for (int i = 0; i < studentNames.length; i++)
        {
            if (studentNames[i].equalsIgnoreCase(studentName))
            {
                return i;
            }
        }
        return -1;
    }
    
    private int findCourseIndex(String courseName)
    {
        for (int i = 0; i < courseNames.length; i++)
        {
            if (courseNames[i].equalsIgnoreCase(courseName))
            {
                return i;
            }
        }
        return -1;
    }
    
    public void showArrays()
    {
        System.out.print("\t");
        for (String courseName : courseNames)
        {
            System.out.print(courseName + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < studentNames.length; i++)
        {
            System.out.print(studentNames[i] + ": ");
            for (int j = 0; j < courseNames.length; j++)
            {
                System.out.print(grades[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}