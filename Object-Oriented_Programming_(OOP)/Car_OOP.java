
class Car {

    String brand;
    int speed;

    // // Contructor: 
    // Car(String brand, int speed) {
    //     brand = brand;
    //     speed = speed;
    // }

    void start() {
        System.out.println(brand + " is starting...");
    }

    void accelerate() {
        speed += 10;
        System.out.println("Speed is: " + speed);
    }

}

public class Car_OOP {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        Car c1 =  new  Car();
        c1.brand = "BMW";
        c1.speed = 120;

        c1.start();
        c1.accelerate();
    }
}
