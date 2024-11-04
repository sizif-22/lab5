package src.vehicles;

public class Truck extends Vehicle {
    private int loadCapacity;
    private static int numberOfTrucks = 0;

    public Truck() {
        super();
        numberOfTrucks++;
    }

    public Truck(String name, String color, double price, int numberOfCylinders, int loadCapacity) {
        super(name, color, price, numberOfCylinders);
        this.loadCapacity = loadCapacity;
        numberOfTrucks++;
    }

    // Setters and getters
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public static int getNumberOfTrucks() {
        return numberOfTrucks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }

    @Override
    public double getTotalPrice() {
        double taxRate = (getNumberOfCylinders() <= 6 && loadCapacity < 3500) ? 0.10 : 0.20;
        return getPrice() * (1 + taxRate);
    }
}
