interface onePiece {
    void size(int a, int b, int c);
}

public class Interface implements onePiece {
    int a, b, c;
    public void size (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
    public static void main (String args[]) {
        Interface itf = new Interface();
        itf.size(98, 111, 99);
    }
}
