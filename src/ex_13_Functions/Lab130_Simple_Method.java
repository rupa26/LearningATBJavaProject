package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {



        //calling
        //int result = promod_f1(); // int wont retun anything
       // System.out.println(result);

        int r = return_f2();
        System.out.println(r);

        float b = return_f3();
        System.out.println(b);

        boolean bo = return_f4();
        System.out.println(bo);


    }
    static void promod_f1(){
        System.out.println("No Return");
    }
    static int return_f2(){
        return 10;
    }
    static float return_f3(){
        return 10.5f;
    }
    static boolean return_f4(){
        return true;
    }

    static byte return_f5(){
        return 100;
    }

    static long return_f6(){
        return 100L;
    }



}
