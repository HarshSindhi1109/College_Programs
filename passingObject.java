class backEnd {
    int a, b;
    backEnd (int a, int b) {
        this.a = a;
        this.b = b;
    }
    void show(backEnd c) {
        if (a == c.a && b == c.b) {
            System.out.println("Both values are equal");
        }
        else {
            System.out.println("Both values are not equal");
        }
    }
}

public class passingObject {
    public static void main (String args[]) {
        backEnd b1 = new backEnd(10, 20);
        backEnd b2 = new backEnd(33, 44);
        backEnd b3 = new backEnd(10, 20);
        b1.show(b2);
        b1.show(b3);
    }
}
