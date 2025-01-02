class logic201 {
    int length, width;
    logic201(int length, int width) {
        this.length = length;
        this.width = width;
    }
    void display() {
        int area;
        area = length * width;
        System.out.println("Area="+area);
    }
}

public class Main {
    public static void main (String args[]) {
        logic201 l1 = new logic201(10, 20);
        logic201 l2 = new logic201(40, 50);
        l1.display();
        l2.display();
    }
}