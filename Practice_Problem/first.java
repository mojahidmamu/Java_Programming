
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;
        System.out.println("The sum of: " + sum);
        // Area of rectangle
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int area = height * width;
        System.out.println("The area of rectangle is: " + area);
    }
}