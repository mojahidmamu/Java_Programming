
class over {

    void area(int a, int b) {
        int z = a + b;
        System.out.println("Area of " + z);
        return;
    }

    void area(double a, double b, double c) {
        double z = a * b * c;
        System.out.println("Area of " + z);
        return;
    }

    void area(int sintia) {
        System.out.println("Girlfriend of Rezuyan: " + sintia);
        return;
    }

}

public class CircleArea {

    public static void main(String args[]) {
        //  method overloading in Java
        over iktiar = new over();
        iktiar.area(5, 10);
        iktiar.area(5.5, 6.5, 2.5);
        iktiar.area(1);
    }
}
