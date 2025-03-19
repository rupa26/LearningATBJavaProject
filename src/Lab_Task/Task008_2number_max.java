package Lab_Task;

public class Task008_2number_max {
    public static void main(String[] args) {
        int number1 =Integer.parseInt(args[0]);
        int number2 =Integer.parseInt(args[1]);
        String result =(number1>number2)?"number 1 in max": "number2 is max";
        System.out.println(result);

    }
}
