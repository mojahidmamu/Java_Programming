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
    }
}
 