package Lab_Task;

public class Task002_In_de_Opertor {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // ++a A-> 11  , a=11
        // a++ B-> 11  , a=12
        // a++ C-> 12 , a=13
        // A+B+C = 34

    }
}
