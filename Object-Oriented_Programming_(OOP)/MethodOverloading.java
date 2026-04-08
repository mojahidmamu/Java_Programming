class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int sum1 = math.add(5, 10);
        int sum2 = math.add(5, 10, 15);
    }
}