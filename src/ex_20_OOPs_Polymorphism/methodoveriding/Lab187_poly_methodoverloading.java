package ex_20_OOPs_Polymorphism.methodoveriding;

public class Lab187_poly_methodoverloading {

    public void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3, 4);
        int r2 = m1.add(3, 4, 5);
        double r3 =m1.add(3.13, 3.56);

    }

      class MathOperations {
        //in the same class , when you have a method with same name
        //but different argument and different return type.
        int add(int a, int b) {
            return a+b;
        }

        int add(int a, int b , int c) {
            return a+b+ c;
        }

         double add(double a, double b) {
            return a+b;
        }
    }
}
