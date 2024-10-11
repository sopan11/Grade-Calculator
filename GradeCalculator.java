import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Please enter a valid number of the subject: ");
            return;
        }
        int totalMarks = 0;
        int maxMarksPerSubject = 100;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter obtained in subject " + i + " (out of 100)");
            int marks = sc.nextInt();

            if (marks < 0 || marks > maxMarksPerSubject) {
                System.out.println("Marks should be in the range of 0 to 100. Please enter valid marks: ");
                i--;
            } else {
                totalMarks += marks;
            }
        }

        float averagePercentange = (float) totalMarks / (numSubjects * maxMarksPerSubject)*100;
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentange);
        
        String grade;
        if (averagePercentange >= 90) {
            grade = "A+";
        } else if (averagePercentange >= 80) {
            grade = "A";
        } else if (averagePercentange >= 70) {
            grade = "B";
        } else if (averagePercentange >= 60) {
            grade = "C";
        } else if (averagePercentange >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}