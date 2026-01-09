
import java.util.Scanner;


public class CircleArea {

    public static void main(String args[]) {
       
        Scanner iktiar = new Scanner(System.in);
        int radius = iktiar.nextInt();
        double Total = Math.PI * radius * radius;
        System.out.println("Total : " + Total);
    }
}
