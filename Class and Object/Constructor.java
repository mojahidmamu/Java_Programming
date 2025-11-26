
class Student {

    String name;
    int age;

    // Constructor: 
    Student(String n, int ag) {
        name = n;
        age = age;
    }

    void showDetails() {
        System.out.println("Name is: " + name + " and age is: " + age);
    }
}

public class Constructor {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Student s1 = new Student("Abdullah", 20);
        Student s2 = new Student("Mina", 19);

        s1.showDetails();
        s2.showDetails();
    }
}
