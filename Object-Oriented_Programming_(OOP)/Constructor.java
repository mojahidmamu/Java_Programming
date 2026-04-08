class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Mojahid" , 120 );
        Student s2 = new Student("Abdullah" , 200 );
        s1.displayInfo();
        s2.displayInfo();

    }
}