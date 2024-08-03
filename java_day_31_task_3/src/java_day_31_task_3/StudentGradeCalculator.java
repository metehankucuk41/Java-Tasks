package java_day_31_task_3;
import java.util.Random;

class StudentGradeCalculator {

    public static int[][] generateGrades(int numberOfStudents, int numberOfCourses) {
        Random random = new Random();
        int[][] grades = new int[numberOfStudents][numberOfCourses];

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfCourses; j++) {
                grades[i][j] = random.nextInt(101);
            }
        }

        return grades;
    }

    public static int calculateStudentGrade(int studentIndex, int[][] grades) {
        int totalGrade = 0;
        for (int grade : grades[studentIndex]) {
            totalGrade += grade;
        }
        return totalGrade / grades[studentIndex].length;
    }

    public static int calculateCourseAverage(int courseIndex, int[][] grades) {
        int totalGrade = 0;
        for (int[] grade : grades) {
            totalGrade += grade[courseIndex];
        }
        return totalGrade / grades.length;
    }
}
