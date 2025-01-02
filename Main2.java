class logic101 {
    int twin_num;
    String twin_name;
    logic101 (int twin_num, String twin_name) {
        this.twin_num = twin_num;
        this.twin_name = twin_name;
    }
    logic101 (logic101 l1) {
        twin_num = l1.twin_num;
        twin_name = l1.twin_name;
    }
    void display() {
        System.out.println(twin_num+" "+twin_name);
    }
}

public class Main2 {
    public static void main (String a[]) {
        logic101 l1 = new logic101 (1, "Rohan");
        logic101 l2 = new logic101 (l1);
        l1.display();
        l2.display();
    }
}
