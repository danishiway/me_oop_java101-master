package src.ShapeOfShapes.shapes;

public class Triangle {
    private double width, height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight(){
      return height;
    }

    public double getWidth(){
      return width;
    }

    public double calculateTriangleArea() {
      //Area = (width * height)/2
        return (width*height)/2;
    }

}
