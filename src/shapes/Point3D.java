package src.shapes;
public class Point3D extends Point2D {
    private double z;
    
    // Constructors
    public Point3D() {
        this(0.0, 0.0, 0.0);
    }
    
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    
    // Setter and getter for z
    public void setZ(double z) { this.z = z; }
    public double getZ() { return z; }
    
    public void setXYZ(double x, double y, double z) {
        setXY(x, y);
        this.z = z;
    }
    
    public double[] getXYZ() {
        return new double[]{getX(), getY(), z};
    }
    
    public double distance(Point3D point) {
        return distance(point.getX(), point.getY(), point.getZ());
    }
    
    public double distance(double x, double y, double z) {
        double dx = getX() - x;
        double dy = getY() - y;
        double dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point3D)) return false;
        if (!super.equals(obj)) return false;
        Point3D point = (Point3D) obj;
        return Double.compare(point.z, z) == 0;
    }
    
    @Override
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f)", getX(), getY(), z);
    }
}