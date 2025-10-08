
class Student {
    String name;
    int age;

    // Constructor: 
    Student(String n, int ag) {
        name = n;
        age = ag;
    }

    // method: 
    void  displayShow()
    {
        System.err.println("Name is: " + name + " and Age is: " + age);
    }
}

public class Student_OOP {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Student s1 = new Student("Mojahid", 18);

        s1.displayShow();
    }
}
