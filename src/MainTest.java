package src;

import src.shapes.Point2D;
import src.shapes.Point3D;
import src.shapes.Figure;
import src.shapes.ClosedFigure;
import src.shapes.Rectangle;
import src.vehicles.Vehicle;
import src.vehicles.Car;
import src.vehicles.Truck;

public class MainTest {
    public static void main(String[] args) {
        testPointClasses();
        System.out.println("\n" + "=".repeat(50) + "\n");
        testFigureClasses();
        System.out.println("\n" + "=".repeat(50) + "\n");
        testVehicleClasses();
    }

    private static void testPointClasses() {
        System.out.println("TESTING POINT2D AND POINT3D CLASSES");
        System.out.println("-".repeat(30));

        // Create array of 5 points as specified
        Point2D[] points = new Point2D[5];
        points[0] = new Point2D(2.0, 3.0);
        points[1] = new Point2D(2.0, 3.0);
        points[2] = new Point2D(5.0, 6.0);
        points[3] = new Point3D(1.0, 2.0, 3.0);
        points[4] = new Point3D(4.0, 5.0, 6.0);

        // Test 2D points
        System.out.println("2D Points Testing:");
        System.out.println("Point 1: " + points[0]);
        System.out.println("Point 2: " + points[1]);
        System.out.println("Point 3: " + points[2]);

        System.out.println("\nTesting 2D points equality:");
        System.out.println("Are points[0] and points[1] equal? " + points[0].equals(points[1]));
        System.out.println("Are points[0] and points[2] equal? " + points[0].equals(points[2]));

        System.out.println("\nTesting 2D distances:");
        System.out.printf("Distance between points[0] and points[2]: %.2f\n",
                points[0].distance(points[2]));

        // Test 3D points
        System.out.println("\n3D Points Testing:");
        Point3D p3d1 = (Point3D) points[3];
        Point3D p3d2 = (Point3D) points[4];

        System.out.println("3D Point 1: " + p3d1);
        System.out.println("3D Point 2: " + p3d2);

        System.out.println("\nTesting 3D distances:");
        System.out.printf("Distance between 3D points: %.2f\n",
                p3d1.distance(p3d2));

        // Test setters and getters
        System.out.println("\nTesting setters and getters:");
        p3d1.setXYZ(7.0, 8.0, 9.0);
        double[] coords = p3d1.getXYZ();
        System.out.println("Updated 3D Point 1: (" +
                coords[0] + ", " +
                coords[1] + ", " +
                coords[2] + ")");
    }

    private static void testFigureClasses() {
        System.out.println("TESTING FIGURE CLASSES");
        System.out.println("-".repeat(30));

        // Create array of figures with different types
        Figure[] figures = new Figure[3];

        // Basic Figure
        figures[0] = new Figure(new Point2D(0, 0), "Red");

        // ClosedFigure
        figures[1] = new ClosedFigure(
                new Point2D(2, 2),
                "Blue",
                5.0f,
                3.0f,
                true);

        // Rectangle
        figures[2] = new Rectangle(
                new Point2D(0, 0),
                new Point2D(4, 3),
                "Green",
                true);

        // Test each figure
        for (int i = 0; i < figures.length; i++) {
            System.out.println("\nFigure " + (i + 1) + ":");
            figures[i].display();

            // Test additional methods for ClosedFigure and Rectangle
            if (figures[i] instanceof Rectangle) {
                Rectangle rect = (Rectangle) figures[i];
                System.out.println("Rectangle area: " + rect.area());
            } else if (figures[i] instanceof ClosedFigure) {
                ClosedFigure closed = (ClosedFigure) figures[i];
                System.out.println("Closed figure area: " + closed.area());
            }
        }
    }

    private static void testVehicleClasses() {
        System.out.println("TESTING VEHICLE CLASSES");
        System.out.println("-".repeat(30));

        // Create array of vehicles
        Vehicle[] vehicles = new Vehicle[4];

        // Create Cars
        vehicles[0] = new Car("Toyota Camry", "Silver", 25000.0, 4, 5);
        vehicles[1] = new Car("BMW M5", "Black", 85000.0, 8, 5);

        // Create Trucks
        vehicles[2] = new Truck("Ford F-150", "White", 35000.0, 6, 3000);
        vehicles[3] = new Truck("Volvo FH", "Blue", 120000.0, 8, 4000);

        // Variables for calculating averages
        double totalCarPrice = 0;
        double totalTruckPrice = 0;
        int carCount = 0;
        int truckCount = 0;

        // Display information and calculate totals
        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle Details:");
            vehicle.display();
            System.out.printf("Total Price (with taxes): $%.2f\n", vehicle.getTotalPrice());

            if (vehicle instanceof Car) {
                totalCarPrice += vehicle.getTotalPrice();
                carCount++;
            } else if (vehicle instanceof Truck) {
                totalTruckPrice += vehicle.getTotalPrice();
                truckCount++;
            }
        }

        // Display averages
        System.out.println("\nAverage Prices:");
        System.out.printf("Average Car Price (with taxes): $%.2f\n",
                totalCarPrice / carCount);
        System.out.printf("Average Truck Price (with taxes): $%.2f\n",
                totalTruckPrice / truckCount);

        // Display total vehicle counts
        System.out.println("\nVehicle Counts:");
        System.out.println("Total Vehicles: " + Vehicle.getNumberOfVehicles());
        System.out.println("Total Cars: " + Car.getNumberOfCars());
        System.out.println("Total Trucks: " + Truck.getNumberOfTrucks());
    }
}