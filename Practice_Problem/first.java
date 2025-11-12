
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

    }
}
