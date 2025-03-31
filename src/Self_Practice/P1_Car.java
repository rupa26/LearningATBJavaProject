package Self_Practice;

public class P1_Car{
    public static void main(String[] args) {
        // creating an object
        Car myCar =new Car();
        //
         // Assigning value to new car
        myCar.brand = "Toyota" ;
        myCar.model ="xays";
        myCar.year = 2025 ;
        //calling the method using the object
        myCar.displayInfo();

    }


}
class Car {
    // attribute
    String brand;
    String model;
    int year;

    // Behavior / method
    void displayInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year
        );

    }
}

