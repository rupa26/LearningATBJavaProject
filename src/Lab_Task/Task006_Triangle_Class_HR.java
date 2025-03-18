package Lab_Task;

import java.util.Scanner;

public class Task006_Triangle_Class_HR {
    public static void main(String[] args) {

        /*int t1 = Integer.parseInt(args[0]);
        int t2 = Integer.parseInt(args[1]);
        int t3 = Integer.parseInt(args[2]);
        */
        System.out.println("Enter the length of the sides");
        Scanner scanner = new Scanner(System.in);
        int s1= scanner.nextInt();
        int s2= scanner.nextInt();
        int s3= scanner.nextInt();

        System.out.println("Entered Value:" + s1 + " "+ s2 +" " + s3);
        if ((s1==s2)&&(s2==s3))
        { System.out.println("The Triangle is Equilateral");}
        else if ((s1==s2)||(s1==s3)||(s2==s3))
        {System.out.println("The Triangle is Isosceles ");}
        else
        {System.out.println("The Triangle is Scalene"); }
}
}