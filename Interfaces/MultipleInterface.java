
interface A {

    void show();
}

interface B {

    void display();
}

class C implements A, B {

    public void show() {
        System.out.println("Showing from A");
    }

    public void display() {
        System.out.println("Displaing from B");
    }
}

public class MultipleInterface {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        C obj = new C();
        obj.show();
        obj.display();
    }
}
