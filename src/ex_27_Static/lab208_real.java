package ex_27_Static;

public class lab208_real {
    public static void main(String[] args) {

        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);

        ATB.doAssignment();
        ATB.joinZoomClass();

        ATB amit = new ATB();
        amit.setName("amit");
        amit.setPhone("123456789");

        ATB lucky = new ATB();
        amit.setName("Lucky");
        amit.setPhone("9993456789");
    }

}
class ATB{
    static {
        System.out.println("load the class , I will execute");
    }
    {
        System.out.println("IIB this is called when object is created");
    }

    private String name;
    private  String phone;
    static  String courseName ="ATB11";
    static String mentorName ="Prammod";

    static void  doAssignment(){
       // System.out.println(phone);//
        System.out.println("Do Assignment");
    }
    static void  joinZoomClass(){
        System.out.println("Classed Joined");
    }

    void  howTheyDoAssignment(){
        System.out.println("It Is Different");
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String amit) {
    }
}
