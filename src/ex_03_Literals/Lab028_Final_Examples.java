package ex_03_Literals;

public class Lab028_Final_Examples {
    public static void main(String[] args) {
        int local;
        local =10;
        local =40;
        System.out.println(local);
        //- Local variable must be initialised before using.
        //- Value of the **final variable can not** be changed.
        //- Value of the **variable can be changed** any number of times during program execution.

        final float Pi = 3.14f;
        //Pi =3.14this is final in Nature
        System.out.println(Pi);

//        - **int age = 65; -> 65.**
//        - Literals can be Numeric and Non Numeric.
//.         data_types variable_name = variable_value
    }
}
