
import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        // --- Your code starts here ---  

        // MINI PROJECT: Simple Banking System 
        Scanner sc = new Scanner(System.in);

        // Randdom number between 0-99: 
        int myNumer = (int) (Math.random() * 100);
        int userNumber = 0;
        do {
            System.out.println("Guess the number: 1-100");
            userNumber = sc.nextInt();

            if (userNumber == myNumer) {
                System.out.println("You guessed  it right");
                break;
            } else if (userNumber < myNumer) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        } while (userNumber != myNumer);

        System.out.println("The correct number was: " + myNumer);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
