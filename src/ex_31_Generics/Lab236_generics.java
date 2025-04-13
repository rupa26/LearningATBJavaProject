package ex_31_Generics;

import ex_01_Java_Basic.TEST$Rupa;

public class Lab236_generics {
    public static void main(String[] args) {

        temp_sum(3, 4);

        temp_sum(3.33, 4.333);

        //temp_sum(Rupa , Rani);

    }

    static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);

        return null;

    }
    /*static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }*/
}

