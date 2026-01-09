
class Student {
    int roll;

    // Constructor method
    Student(int R) {
        roll = R;
    }

    Student(Student s) {
        roll = s.roll;
    }

    void display() {
        System.out.println("Roll number: " + roll);
    }
}
    public class CircleArea {

        public static void main(String args[]) {
            //  Constructor method
            Student Lam = new Student(05);
            Lam.display();

            Student John = new Student(Lam);
            John.display();
        }
    }
