 //Task 2 
 //Student Grade Calculator

import java.util.Scanner;

public class StudentGradeCalculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        int numSubjects;

        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();

        
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        System.out.println("Total Marks: " + totalMarks);

    
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");


        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
