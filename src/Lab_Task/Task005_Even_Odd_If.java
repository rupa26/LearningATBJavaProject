package Lab_Task;

import java.util.Scanner;

public class Task005_Even_Odd_If {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println(number);
        if ((number%2==0)){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}
