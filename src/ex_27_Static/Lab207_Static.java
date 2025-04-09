package ex_27_Static;

public class Lab207_Static {
    public static void main(String[] args) {

        B.commonAll();
        System.out.println(B.b);

        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);

    }
}


    class B{
        static {// static block
            System.out.println("SIB , called once , class is loaded");
        }

        int a = 10;//
        static  int b = 10; //static variable

        void display(){//non-static function
            System.out.println(b);
            System.out.println("No static F(n)");
        }
        static void commonAll(){//static function
           // System.out.println(a); you cannot call or use non-static instance variable under static
            System.out.println("static F(n)");

        }

        /*static class C {

        }*/
    }

