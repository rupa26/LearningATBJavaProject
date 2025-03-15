package Lab_Task;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args){
                Scanner input = new Scanner(System.in);
               System.out.print("Enter your score: ");
                int score = input.nextInt();
                if (score > 100) {
                    System.out.println("Invalid Input");
                    //char grade = (score > 89) ? 'A' : (score > 79) ? 'B' : (score >69 ) ? 'C' : (score > 59) ? 'D' : 'F';
                }else{
        String Result = (score>=90)&&(score<=100)?"A":(score>=80)&&(score<=89)?"B":(score>=70)&&(score<=79)?"C":(score>=60)&&(score<=69)?"D":"F";

        System.out.println("Grade: " + Result);}

                //

       /* A: 90-100

        B: 80-89

        C: 70-79

        D: 60-69

        F: 0-59*/
            }
}
