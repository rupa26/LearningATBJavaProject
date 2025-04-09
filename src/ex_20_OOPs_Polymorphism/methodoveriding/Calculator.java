package ex_20_OOPs_Polymorphism.methodoveriding;

public class Calculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(3,5);
        c1.add(3.4,4.3);
    }
    public int add(int a , int b){
        return a+b ;
    }
    public double add(double a , double b){
        return a+b ;
    }
}
