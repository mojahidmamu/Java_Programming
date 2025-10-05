// Define a class

class Student {

    // Fields (Attributes)
    String name;
    int roll;
    int marks;

    // Method (Behavior)
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}

// Main class
public class StudentExample {

    public static void main(String[] args) {
        // Create object of Car
        Student s1 = new Student();
        Student s2 = new Student();

        // Assign values to S1: 
        s1.name = "Abdullah all Mojahid";
        s1.roll = 884913;
        s1.marks = 32;

        // Assign values to S2: 
        s1.name = "Mahmud";
        s1.roll = 884888;
        s1.marks = 85;
        // Call method
        s1.showDetails();
        s2.showDetails();
    }
}
