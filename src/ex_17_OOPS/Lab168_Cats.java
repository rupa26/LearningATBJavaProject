package ex_17_OOPS;

import java.sql.SQLOutput;

public class Lab168_Cats {

    public static void main(String[] args) {

        Cat c1 =new Cat();
        Cat c2;
        new Cat();

        c1.running();
        //c2.running();// no object is created

        new Cat().running();
        System.out.println(new Cat().name);
    }

}

class Cat{
    String name;// null
    void running(){
        System.out.println("Running");
    }
}

