public class pr2_8_1 {
    public static void main(String args[]) {
        pr2_8_1 p1 = new pr2_8_1();
        System.out.println("Area of rectangle: "+p1.area(13.9, 12.7));
        System.out.println("Area of square: "+p1.area(15.65f));
    }
    double area(double l, double b)
    {
        return (l*b);
    }
    float area(float s)
    {
        return (s*s);
    }
}