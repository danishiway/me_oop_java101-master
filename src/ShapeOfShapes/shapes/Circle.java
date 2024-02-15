package src.ShapeOfShapes.shapes;

public class Circle {
    double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
      return radius;
    }

    public double calculateCircleArea() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }
 
}
