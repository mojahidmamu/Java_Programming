
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        // int c = 20;
        // int sum = a + b + c;
        // System.out.println("The sum of: " + sum);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a * b;
        System.out.println("The area of rectangle is: " + area);
    }
}