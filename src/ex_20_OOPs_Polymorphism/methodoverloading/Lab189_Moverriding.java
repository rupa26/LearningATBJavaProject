package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab189_Moverriding {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.sound(); // Bark

        Animal d2= new Animal();
        d2.sound(); //Animal sound
    }

}
class  Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}
 class Dog extends Animal{
    @Override
     void sound(){
        System.out.println("Bark");
    }
 }
