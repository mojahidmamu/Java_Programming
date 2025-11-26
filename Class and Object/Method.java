class Student {

    String name;
    int age;

    void showDetails() {
        System.out.println("Name is: " + name + " and age is: " + age);
    }
}

public class Method{  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Student s1 = new Student();
        s1.name = "Mojahid";
        s1.age = 18;

        // method call:
        s1.showDetails();
    }
}
