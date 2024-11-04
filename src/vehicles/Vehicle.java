package src.vehicles;

public class Vehicle {
    private String name;
    private String color;
    private double price;
    private int numberOfCylinders;
    private static int numberOfVehicles = 0;
    
    public Vehicle() {
        this("Unknown", "Unknown", 0.0, 0);
    }
    
    public Vehicle(String name, String color, double price, int numberOfCylinders) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.numberOfCylinders = numberOfCylinders;
        numberOfVehicles++;
    }
    
    // Setters and getters
    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(double price) { this.price = price; }
    public void setNumberOfCylinders(int numberOfCylinders) { this.numberOfCylinders = numberOfCylinders; }
    public String getName() { return name; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
    public int getNumberOfCylinders() { return numberOfCylinders; }
    public static int getNumberOfVehicles() { return numberOfVehicles; }
    
    public void display() {
        System.out.println("Vehicle: " + name +
                         "\nColor: " + color +
                         "\nPrice: $" + price +
                         "\nNumber of Cylinders: " + numberOfCylinders);
    }
    
    public double getTotalPrice() {
        return price; // Base price without taxes
    }
}

