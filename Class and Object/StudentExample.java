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
        Student s3 = new Student();
        Student s4 = new Student();

        // Assign values to S1: 
        s1.name = "Mojahid + ?";
        s1.roll = 884913;
        s1.marks = 32;

        // Assign values to S2: 
        s2.name = "Mahmud + Tahmina";
        s2.roll = 884885;
        s2.marks = 85;

        // Assign values to S3: 
        s3.name = "Sazzad + Shela";
        s3.roll = 798716;
        s3.marks = 96;

        // Assign values to S4: 
        s4.name = "Saidur + Afrin";
        s4.roll = 884889;
        s4.marks = 90;

        // Call method
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        s4.showDetails();
    }
}
