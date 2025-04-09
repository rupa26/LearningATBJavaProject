package ex_27_Static;

public class Lab205_Static {
    public static void main(String[] args) {
    //P a = new P();
        P p1 =new P();
        P p2 =new P();
    }

    //IIB - object - 2 times
    //SIB - class - 1 times(class is loaded only one time)

}

class P{
    static
    {
        System.out.println("SIB");
    }
     {
        System.out.println("IIB");
    }

    P(){
        System.out.println("DC");
    }


}