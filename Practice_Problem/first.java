
public class first {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;
        System.out.println("The sum of: " + sum);
        // Area of rectangle
        int height = 10;
        int width = 20;
        int area = height * width;
        System.out.println("The area of rectangle is: " + area);

        // month to days
        int month = 7;
        int days = month * 30;
        System.out.println("The days in " + month + " months are: " + days);

        // hours to minutes
        int hours = 5;
        int minutes = hours * 60;
        System.out.println("The minutes in " + hours + " hours are: " + minutes);

        //  centigrate to fahrenheit
        int centigrate = 37;
        int fahrenheit = (centigrate * 9 / 5) + 32;
        System.out.println(centigrate + " degree centigrate is equal to " + fahrenheit + " degree fahrenheit.");

        // average of three numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average of three numbers is: " + average);

        // leaping year
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // triangle area
        int len1 = 5;
        int len2 = 10;
        int len3 = 7;
        if (len1 + len2 > len3 && len2 + len3 > len1 && len3 + len1 > len2) {
            int s = (len1 + len2 + len3) / 2;
            double area1 = Math.sqrt(s * (s - len1) * (s - len2) * (s - len3));
            System.out.println("The area of the triangle is: " + area1);
        } else {
            System.out.println("The lengths do not form a triangle.");
        }

        // Quadratic equation roots
        int A = 1;
        int B = -3;
        int C = 2;
        double D =(( B * B )- (4 * A * C));
        if (D > 0) {
            double root1 = (-B + Math.sqrt(D)) / (2 * A);
            double root2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("Roots are real and different. Root1: " + root1 + ", Root2: " + root2);
        } else if (D == 0) {
            double root = -B / (2 * A);
            System.out.println("Roots are real and same. Root: " + root);
        } else {
            System.out.println("Roots are not possible");
        }

        // prime number check
        int number = 9;
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Nested for loops to print a pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Fibonacci series
        int terms = 10;
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        // prime with in range
        int lower = 10, upper = 50;
        System.out.println("\nPrime numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper; num++) {
            boolean prime = true;
            if (num <= 1) {
                prime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime) {
                System.out.print(num + " ");
            }
        }

        // factorial of number
        int number1 = 5;
        long factorial = 1;
        for (int i = 1; i <= number1; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number1 + " is: " + factorial);
    }
}
