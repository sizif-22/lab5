package src.shapes;
public class Point2D {
    private double x;
    private double y;
    
    // Constructors
    public Point2D() {
        this(0.0, 0.0);
    }
    
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Setters and getters
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }
    
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double[] getXY() {
        return new double[]{x, y};
    }
    
    public double distance(Point2D point) {
        return distance(point.getX(), point.getY());
    }
    
    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point2D)) return false;
        Point2D point = (Point2D) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }
    
    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }
}

