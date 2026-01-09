
public class CircleArea {

    public static void main(String args[]) {
        // Quadratic Equation: ax^2 + bx + c = 0
        double a = 1;
        double b = -5;
        double c = 6;
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are complex and different.");
        }

