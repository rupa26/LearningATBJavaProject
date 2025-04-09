package ex_28_Enum;

public class Lab210_Enum {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(PROJECTS_URLS.google);


      /* A a = new A();
        System.out.println(a.days[4]);*/
    }
}
   /*class A{
    String[] days ={"SUN", "MOND", "TUES", "WED", "THU", "FRI", "SAT"};
}*/

    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY
    }

    enum PROJECTS_URLS{
    google , Katalon, vwo
    }







