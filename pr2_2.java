class demo201 {
    int id;
    String name;
    demo201(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
public class pr2_2 {
    public static void main(String args[]) {
        demo201 d1 = new demo201(1,"Harsh");
        demo201 d2 = new demo201(2,"Souvik");
        demo201 d3 = new demo201(3,"Sanskar");
        demo201 d4 = new demo201(4,"Gautam");
        demo201 d5 = new demo201(5,"Viren");
        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
    }
}