
class Student {

    String name;
    int id;

    // copy constructor-1: (No parameter) 
    Student() {
        name = "Mojahid";
        id = 0;
    }

    // copy constructor-2: (one parameter) 
    Student(int i) {
        name = "Mojahid";
        id = i;
    }

    // copy constructor-3: (two parameter) 
    Student(String nm, int i) {
        name = nm;
        id = i;
    }

    void  display() {
        System.out.println(id + " " + name);
    }

}

public class Copy_Constructor {

    public static void main(String[] args) {
        Student s1 = new  Student();
        Student s2 = new  Student(10);
        Student s3 = new  Student("abdullah", 11);

        s1.display();
        s2.display();
        s3.display();
    }
}
