package src.ShapeOfShapes;

import src.ShapeOfShapes.shapes.*;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println("Area of Circle1 : " + circle1.calculateCircleArea());

        Triangle triangle1 = new Triangle(5, 10);
        System.out.println("Area of triangle1 : " + triangle1.calculateTriangleArea());

    }
//   public static void main(String[] args) {
//         Circle shape1 = new Circle(5);
//         Triangle shape2 = new Triangle(5, 10);

//         printArea(shape1);
//         printArea(shape2);
//     }
//     public static void printArea(Shape shape){
//         System.out.println("Area: " + shape.calculateArea());
//     }  
}
