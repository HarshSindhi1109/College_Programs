interface classA {
    float pi = 3.14f;
    float radius = 3.37f;
    void circleArea();
}

interface classB {
    float length = 5.78f;
    void squareArea();
}

public class multipleInheritance implements classA, classB {
    public void circleArea() {
        float area;
        area = pi * radius * radius;
        System.out.println("Area of circle = "+pi+" * "+radius+" * "+radius+" = "+area);
    }
    public void squareArea() {
        float area;
        area = length * length;
        System.out.println("Area of square = "+length+" * "+length+" = "+area);
    }
    public static void main(String args[]) {
        multipleInheritance obj = new multipleInheritance();
        obj.circleArea();
        obj.squareArea();
    }
}
