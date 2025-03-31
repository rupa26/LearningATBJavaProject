package Lab_Task;

import ex_17_OOPS.Person2;

public class Task20_Person_Class_AB {
    public static void main(String[] args) {
        // creating an instance of Person class
        Person p1 =new Person();
        // 1. Without Parameters and Without Return Type
        p1.greet();
        // 2. Without Parameters but With Return Type
        String gender = p1.getGender();
        System.out.println("Gender: " + gender);

        // 3. With Parameters and Without Return Type
        p1.personDetails("Rupa", "Pune");

        // 4. With Parameters and With Return Type
        double salary = p1.personSalary(50000);
        System.out.println("Returned Salary: " + salary);

    }
}
class Person{
    String firstName;
    String lastName;
    int age;
    String address;
    double salary;
    boolean ismarried;
    String phone;
    String gender= "Female";
    String location;
    String job;

    // 1.Without Argument / Parameters and Without Return Type.
    void greet(){
        System.out.println("Hi");
    }

    //  2. Without Parameters but With Return Type
    String getGender (){
            return gender;
    }

    //  3. With Parameters and Without Return Type ( 90%)
    void personDetails(String FirstName, String location){
        System.out.println("FirstName" + " "+ FirstName + " " +"location" + " " +location);
    }

    //  4. With Parameters and With Return Type
    double personSalary(double salary){
        System.out.println("Salary is " +salary);
        return salary;
    }


}