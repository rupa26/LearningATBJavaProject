package ex_26_IIB;

public class Lab204_IIB {
    //IIB
    //Instance initialization Block
    //I will be executed when an object is created

    public static void main(String[] args) {
      new A1();
    }
}


class A1 {
    A1() {
        System.out.println("DC"); // Constructor
    }

    {
        System.out.println("Hi , I am IIB");
        System.out.println("if you want you execute or call something when an object is created  ");
    }//mysql connection
    // read json , xml
    //read a text file or env file

    {
        System.out.println("Hi , I am IIB 2");
    }
}
