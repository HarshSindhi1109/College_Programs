class demo101 {
    int a,b;
    void display()
    {
        a=5;
        b=8;
        System.out.println((a+b));
    }
}

public class pr2_1 {
    public static void main(String args[]) {
        demo101 d1 = new demo101();
        d1.display();
    }
}
