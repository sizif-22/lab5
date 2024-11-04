package src.shapes;

public class Rectangle extends ClosedFigure {
    public Rectangle() {
        super();
    }
    
    public Rectangle(Point2D startPoint, String color, boolean filled) {
        super(startPoint, color, 0, 0, filled);
    }
    
    public Rectangle(Point2D startPoint, Point2D endPoint, String color, boolean filled) {
        super(startPoint, color, 0, 0, filled);
        calculateDimensions(endPoint);
    }
    
    private void calculateDimensions(Point2D endPoint) {
        setWidth((float)Math.abs(endPoint.getX() - getStartPoint().getX()));
        setHeight((float)Math.abs(endPoint.getY() - getStartPoint().getY()));
    }
    
    @Override
    public float area() {
        return getWidth() * getHeight();
    }
    
    @Override
    public void display() {
        System.out.println("Rectangle starting at " + getStartPoint() +
                         "\nColor: " + getColor() +
                         "\nWidth: " + getWidth() +
                         "\nHeight: " + getHeight() +
                         "\nFilled: " + isFilled() +
                         "\nArea: " + area());
    }
}
