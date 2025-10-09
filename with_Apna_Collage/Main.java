
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        System.out.println("Hello, Apna College!");

        System.out.println("This is my first Java program.");
        System.out.println("I am excited to learn Java programming.");
        System.out.println("Java is a versatile and powerful language.");

        int[] marks = new int[5];
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 88;
        marks[4] = 92;

        System.out.println("Marks obtained in the subjects are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

         
        // sorting the array
        Arrays.sort(marks);
        System.out.println("Sorted marks: " + Arrays.toString(marks));

        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Casting: Widening and Narrowing
        int myInt = 9;
        double myDouble = myInt; // Widening conversion
        System.out.println("Widening: " + myDouble);
        int anotherInt = (int) myDouble; // Narrowing conversion
        System.out.println("Narrowing: " + anotherInt);



        // Constants       
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
    }
}
