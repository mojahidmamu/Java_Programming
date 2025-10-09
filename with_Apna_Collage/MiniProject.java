import java.util.Scanner;
public class MiniProject {

    public static void main(String[] args) {
        // --- Your code starts here ---  
        // MINI PROJECT: Simple Banking System 
        
        Scanner sc = new Scanner(System.in);
        int myNumer = (int) (Math.random() * 100);
        do {
            System.err.println("Guess the number");
            int userNumber = sc.nextInt();

            if (userNumber == myNumer) {
                System.out.println("You guessed it right");
                break;
            } 
            else if (userNumber < myNumer) {
                System.out.println("Too low");
            }
             else {
                System.out.println("Too high");
            }
        }  
    }
}
