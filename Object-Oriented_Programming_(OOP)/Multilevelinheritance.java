class Animal {
    void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class puppy extends Dog{
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}