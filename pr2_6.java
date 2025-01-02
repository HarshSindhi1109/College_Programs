class def {
    String name;
    double per;
    def(String name, double per)
    {
        this.name = name;
        this.per = per;
    }
    def(def inetly)
    {
        name = inetly.name;
        per = inetly.per;
    }
    void display()
    {
        System.out.println(name+" "+per+"%");
    }
}
public class pr2_6 {
    public static void main(String args[]) {
        def d1 = new def("Harsh", 96.69);
        def d2 = new def(d1);
        d1.display();
        d2.display();
    }
}
