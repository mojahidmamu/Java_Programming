
import java.util.*; // import everything from java.util package


public class PackageExample2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Date today = new Date();
        System.out.println("Age: " + age + ", Today: " + today);
    }
}
