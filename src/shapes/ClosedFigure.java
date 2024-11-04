package src.shapes;

public class ClosedFigure extends Figure {
    private float width;
    private float height;
    private boolean filled;
    
    public ClosedFigure() {
        this(new Point2D(), "black", 0, 0, false);
    }
    
    public ClosedFigure(Point2D startPoint, String color, float width, float height, boolean filled) {
        super(startPoint, color);
        this.width = width;
        this.height = height;
        this.filled = filled;
    }
    
    // Setters and getters
    public void setWidth(float width) { this.width = width; }
    public void setHeight(float height) { this.height = height; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public float getWidth() { return width; }
    public float getHeight() { return height; }
    public boolean isFilled() { return filled; }
    
    public float area() {
        return width * height;
    }
    
    @Override
    public void display() {
        System.out.println("Closed Figure starting at " + getStartPoint() + 
                         "\nColor: " + getColor() +
                         "\nWidth: " + width +
                         "\nHeight: " + height +
                         "\nFilled: " + filled);
    }
}