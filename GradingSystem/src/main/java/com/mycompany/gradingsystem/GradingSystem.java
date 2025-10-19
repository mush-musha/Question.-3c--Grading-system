
package com.mycompany.gradingsystem;
import java.util.Scanner;
/**
 *
 * @author MUSHABE ALLOYSIUS
 */
public class GradingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0;
        int grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
        
         System.out.println("============================ ");
        System.out.println(" BUKOTO COMPREHESIVE SCHOOL ");
        System.out.println("     GRADING SYSTEM ");
         System.out.println("============================ ");
          System.out.println("");
        System.out.println("Enter marks for 5 students");
        
        int count = 1;
        while (count <= 5) {
            System.out.print("Student " + count + " marks: ");
            int marks = input.nextInt();
            
            if (marks >= 80) {
                System.out.println("Grade 1 - Distinction");
                grade1++;
            } else if (marks >= 75) {
                System.out.println("Grade 2 - Distinction");
                grade2++;
            } else if (marks >= 66) {
                System.out.println("Grade 3 - Credit");
                grade3++;
            } else if (marks >= 60) {
                System.out.println("Grade 4 - Credit");
                grade4++;
            } else if (marks >= 50) {
                System.out.println("Grade 5 - Credit");
                grade5++;
            } else if (marks >= 45) {
                System.out.println("Grade 6 - Credit");
                grade6++;
            } else if (marks >= 35) {
                System.out.println("Grade 7 - Pass");
                grade7++;
            } else if (marks >= 30) {
                System.out.println("Grade 8 - Pass");
                grade8++;
            } else {
                System.out.println("Grade 9 - Fail");
                grade9++;
            }
            
            count++;
        }
        
        System.out.println("\nGrade Summary:");
        System.out.println("Grade 1: " + grade1 + " students");
        System.out.println("Grade 2: " + grade2 + " students");
        System.out.println("Grade 3: " + grade3 + " students");
        System.out.println("Grade 4: " + grade4 + " students");
        System.out.println("Grade 5: " + grade5 + " students");
        System.out.println("Grade 6: " + grade6 + " students");
        System.out.println("Grade 7: " + grade7 + " students");
        System.out.println("Grade 8: " + grade8 + " students");
        System.out.println("Grade 9: " + grade9 + " students");
        
        input.close();
    }

}

