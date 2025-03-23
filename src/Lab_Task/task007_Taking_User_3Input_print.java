package Lab_Task;

import java.util.Scanner;

public class task007_Taking_User_3Input_print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter Your Age : ");
        int age = scanner.nextInt();

        System.out.println("Enter your Salary : ");
        double  salary = scanner.nextFloat();
        // print the collected information
        System.out.println("\n -- User Information ---");
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Salary " + salary);

        // Close the scanner
        scanner.close();


    }
}
