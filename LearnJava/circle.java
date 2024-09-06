public class circle {
    double radius;
    circle(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
