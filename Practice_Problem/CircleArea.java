
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
        System.out.println("Roll number of lam is " + roll);
    }
}
    public class CircleArea {

        public static void main(String args[]) {
            //  Constructor method
            Student Lam = new Student(10);
            Lam.display();

            Student John = new Student(50);
            John.display();
        }
    }
