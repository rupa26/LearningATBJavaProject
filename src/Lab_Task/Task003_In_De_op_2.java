package Lab_Task;

public class Task003_In_De_op_2 {
    public static void main(String[] args) {
        int a =20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        // --a -> 19  , a=19
        // a++ -> 19  , a=20
        // a-- -> 20 , a=19
        // A+B+C = 58 , a= 19

    }
}
