import java.util.*;

public class MiniProject2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy (1–50)");
        System.out.println("2. Medium (1–100)");
        System.out.println("3. Hard (1–200)");
        System.out.print("Enter your choice: ");
        int level = sc.nextInt();

        int maxRange;
        if (level == 1) {
            maxRange = 50;
        } else if (level == 2) {
            maxRange = 100;
        } else {
            maxRange = 200;
        }

        int myNumber = random.nextInt(maxRange) + 1;
        int userNumber = 0;
        int attempts = 0;

        System.out.println("\nI have picked a number between 1 and " + maxRange + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            userNumber = sc.nextInt();
            attempts++;

            if (userNumber == myNumber) {
                System.out.println("🎉 You guessed it right in " + attempts + " attempts!");
                break;
            } else if (userNumber < myNumber) {
                System.out.println("📉 Too low! Try again.");
            } else {
                System.out.println("📈 Too high! Try again.");
            }

            // Give user a hint if too many attempts
            if (attempts % 5 == 0) {
                if (userNumber < myNumber) {
                    System.out.println("💡 Hint: The number is greater than " + userNumber);
                } else {
                    System.out.println("💡 Hint: The number is smaller than " + userNumber);
                }
            }
        }

        // Score based on performance
        int score = Math.max(0, 100 - (attempts * 5));
        System.out.println("\n🏆 Your score: " + score);

        System.out.println("The correct number was: " + myNumber);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
