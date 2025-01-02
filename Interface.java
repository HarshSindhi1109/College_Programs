interface onePiece {
    void size(int nami, int boa, int robin);
}

public class Interface implements onePiece {
    int nami, boa, robin;
    public void size (int nami, int boa, int robin) {
        this.nami = nami;
        this.boa = boa;
        this.robin = robin;
        System.out.println("Nami's size = "+nami);
        System.out.println("Boa's size = "+boa);
        System.out.println("Robin's size = "+robin);
    }
    public static void main (String args[]) {
        Interface itf = new Interface();
        itf.size(98, 111, 99);
    }
}
