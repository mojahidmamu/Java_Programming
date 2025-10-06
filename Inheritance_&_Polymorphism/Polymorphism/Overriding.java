
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Overriding {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Animal a;
        a = new Dog();
        a.sound();

        a = new Dog();
        a.sound();
    }
}
