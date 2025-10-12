
import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        // --- Your code starts here ---  

        // MINI PROJECT: Number Guessing Game
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to the Number Guessing Game!");
        // Randdom number between 0-99: 
        int myNumer = (int) (Math.random() * 100);
        int userNumber = 0;
        do {
            System.out.print("Enter your guess: (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumer) {
                System.out.println("You guessed  it right. Congratulations!");
                break;
            } else if (userNumber < myNumer) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        } while (userNumber != myNumer);

        System.out.println("The correct number was: " + myNumer);
        System.out.println("Thanks for playing! by Abdullah all Mojahid");
        sc.close();
    }
}
