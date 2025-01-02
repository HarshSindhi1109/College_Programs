class abc456 {
    void def(int a, int b)
    {
        System.out.println(a+"-"+b+"="+(a-b));
    }
}
class xyz extends abc456 {
    void def(int a, int b)
    {
        System.out.println(a+"*"+b+"="+(a*b));
    }
}
public class pr2_8_2 {
    public static void main(String args[]) {
        xyz x1 = new xyz();
        x1.def(70,81);
    }
}