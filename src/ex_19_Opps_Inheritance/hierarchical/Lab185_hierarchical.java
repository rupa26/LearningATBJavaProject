package ex_19_Opps_Inheritance.hierarchical;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Father f1= new Father();
        Pramod p1 = new Pramod();
        Ruhani r1 = new Ruhani();
        Lucky l1 =new Lucky();

        f1.home();

        r1.home();
        r1.r2();

        p1.home();
        p1.h2();

        l1.home();
        l1.l2();
    }
}
class Father{
    void home(){
        System.out.println("3bhk");
    }
}

class Pramod extends Father{
    void h2() {
        System.out.println("h2-home");
    }

}
class Lucky extends Father{
    void l2() {
        System.out.println("lucky");
    }
}
class Ruhani extends Father{
    void r2() {
        System.out.println("ruhani");
    }
        }