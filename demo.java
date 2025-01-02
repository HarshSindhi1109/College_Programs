class abc {
    int a, b;

    abc(int c, int d) {
        a = c;
        b = d;
    }

    abc(abc e) {
        a = e.a;
        b = e.b;
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

public class demo {
    public static void main(String args[]) {
        abc e = new abc(2, 3);
        abc f = new abc(e);
        e.display();
        f.display();
    }
}