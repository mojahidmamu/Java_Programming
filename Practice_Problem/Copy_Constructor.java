
class Student {

    String name;
    int id;

    // normal constructor
    Student(String nm, int i) {
        name = nm;
        id = i;
    }

    // copy constructor 
    Student(Student s) {
        name = s.name;
        id = s.id;
    }

    void display() {
        System.out.println("Name is " + name + " and id is:" + id);
    }

}

public class Copy_Constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Mojahid", 11);
        Student s2 = new Student(s1);

        System.out.println("Vaia,,kaj ta tik hoi nai?");

        s1.display();
        s2.display();

    }
}
