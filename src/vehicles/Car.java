package src.vehicles;

public class Car extends Vehicle {
    private int numberOfPassengers;
    private static int numberOfCars = 0;
    
    public Car() {
        super();
        numberOfCars++;
    }
    
    public Car(String name, String color, double price, int numberOfCylinders, int numberOfPassengers) {
        super(name, color, price, numberOfCylinders);
        this.numberOfPassengers = numberOfPassengers;
        numberOfCars++;
    }
    
    // Setters and getters
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }
    public int getNumberOfPassengers() { return numberOfPassengers; }
    public static int getNumberOfCars() { return numberOfCars; }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
    
    @Override
    public double getTotalPrice() {
        double taxRate = getNumberOfCylinders() <= 4 ? 0.15 : 0.30;
        return getPrice() * (1 + taxRate);
    }
}



