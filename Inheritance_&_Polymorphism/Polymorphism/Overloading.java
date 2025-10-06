
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Calculator calc = new Calculator();
        System.out.println("Total is: " + calc.add(10, 5));
        System.out.println("Total is: " + calc.add(10.5, 5.5));
    }
}
