
import java.util.Scanner;

public class  Tw_D_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the number of elements");
        int n = input.nextInt();

        int[] arr = new int[n];
        // Taking input from user: 
        System.err.println("Enter " + n + "  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // print all element: 
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
