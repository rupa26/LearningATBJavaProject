package ex_08__If_Conditions;

import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {
        //How to take input
        //1> CLI
        //int age = Integer.parseInt(args[0]);

        // 2> Scanner class
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age > 18){
            System.out.println("you are allowed to vote");
        }
        else{
            System.out.println("You are not allowed to vote");
        }

    }
}
