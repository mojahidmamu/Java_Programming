
public class CircleArea {

    public static void main(String args[]) {

        // Scanner iktiar = new Scanner(System.in);
        int a = 18;
        int b = 20;
        int c = 30;
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            int s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle is: " + area);
        } else {
            System.out.println("No, triangle is not possible");
        }
    }
}
