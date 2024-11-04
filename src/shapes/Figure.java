package src.shapes;

public class Figure {
    private Point2D startPoint;
    private String color;
    
    public Figure() {
        this(new Point2D(), "black");
    }
    
    public Figure(Point2D startPoint, String color) {
        this.startPoint = startPoint;
        this.color = color;
    }
    
    // Setters and getters
    public void setStartPoint(Point2D startPoint) { this.startPoint = startPoint; }
    public void setColor(String color) { this.color = color; }
    public Point2D getStartPoint() { return startPoint; }
    public String getColor() { return color; }
    
    public void display() {
        System.out.println("Figure starting at " + startPoint + " with color " + color);
    }
}
