
public class CircleArea {

    public static void main(String args[]) {
        // Quadratic Equation: ax^2 + bx + c = 0
        double a = 1;
        double b = -5;
        double c = 6;
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1: " + root1 + " Root 2: " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are impossible.");

        }

    }
}
