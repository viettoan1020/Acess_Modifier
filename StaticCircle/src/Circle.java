public class Circle {
    private static int count;
    private static final double PI = 3.14;

    private static double totalArea;
    private int id;
    protected double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.id = ++count;
        this.radius = radius;
        totalArea += getArea();
    }
    public static int getCount() {
        return count;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getCircumference() {
        return PI * radius * 2;
    }
    private static double maxRadius = 0;
    public static double getMaxRadius() {
        return maxRadius;
    }
    public static void setMaxRadius(double radius) {
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }
    public static double getTotalArea() {
        return totalArea;
    }
}
