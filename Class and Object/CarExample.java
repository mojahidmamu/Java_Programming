// Define a class
class Car {
    // Fields (Attributes)
    String color;
    String brand;
    int speed;

    // Method (Behavior)
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class
public class CarExample {
    public static void main(String[] args) {
        // Create object of Car
        Car myCar = new Car();

        // Assign values
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.speed = 120;

        // Call method
        myCar.showDetails();
    }
}