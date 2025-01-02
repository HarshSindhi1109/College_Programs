abstract class demo501 {
    abstract void display();
    abstract void msg(String sms);
}

class demo601 extends demo501 {

    void display()
    {
        System.out.println("This is first abstract class");
    }

    void msg(String sms)
    {
        System.out.println(sms);
    }
}
public class pr2_7 {
    public static void main(String args[]) {
        demo601 d1 = new demo601();
        String sms = "This is second abstract class";
        d1.display();
        d1.msg(sms);
    }
}
