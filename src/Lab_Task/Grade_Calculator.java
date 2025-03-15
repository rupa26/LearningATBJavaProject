package Lab_Task;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args){
                Scanner input = new Scanner(System.in);
               // System.out.print("Enter your score: ");
                int score = input.nextInt();
                char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
                System.out.println("Grade: " + grade);
            }
}
