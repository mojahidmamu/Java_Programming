// Parent class: 

class animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

// Child class: 
class Dogs extends animal {
    void barks() {
        System.out.println("Dogs can bark");
    }
}

public class InheritanceExample {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Dogs dogs = new Dogs();
        dogs.eat(); // Inherited from Animal 
        dogs.barks(); // Defined in Dog
    }
}
