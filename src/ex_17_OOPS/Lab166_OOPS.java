package ex_17_OOPS;

public class Lab166_OOPS {

    public static void main(String[] args) {

        Person amit;
        Person p2 = new Person();
        p2.name = "Lucky";
        System.out.println(p2.name);

        // person =class
        // p2 = objet reference
        //new Person=  Object

        Person p3 = new Person();
        p3.name = "pramod";
        System.out.println(p3.name);

        new Person().name = "Not ref name";

    }

}


class Person{

    // Attribute | Properties | Data members| Instance variables

    String name;
    String phone;
    String  calor_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean ismale;


    // Behavior| Functions | Method
    void  sleep(){
        System.out.println("i am sleeping");
    }

    String greet(){
        return "Hello" + name;
    }

    void talk(){
        System.out.println("talking");
    }

    int remaining_salary(int salary, int tax){
        return salary-tax;
    }


}