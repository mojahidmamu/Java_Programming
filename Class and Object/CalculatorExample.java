
class Calculator {

    //  Methods: 
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class CalculatorExample {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Calculator calc = new Calculator();

        System.out.println("Sum : " + calc.add(10, 5));
        System.out.println("Subtraction : " + calc.subtract(10, 5));
        System.out.println("Multiplication : " + calc.multiply(10, 5));
        System.out.println("Divition : " + calc.divide(10, 5));
    }
}
