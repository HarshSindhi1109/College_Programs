class abc123 {
    int a, b, c=1;
    abc123()
    {
        a=2;
        b=3;
    }
    abc123(int a, int b)
    {
        this.a = a;
        this.b = b;
        c++;
    }
    void display()
    {
        System.out.println("a"+c+"="+a);
        System.out.println("b"+c+"="+b);
    }
}
public class pr2_5 {
    public static void main(String args[]) {
        abc123 xy1 = new abc123();
        abc123 xy2 = new abc123(50,60);
        xy1.display();
        xy2.display();
    }
}
