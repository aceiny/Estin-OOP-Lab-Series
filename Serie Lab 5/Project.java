// run "javac Project.java" to compile
// and then run "java Project" to execute
import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

interface Drawable {
    default void draw(){
        System.out.println("Drawing a shape..");
    };
}

class Circle extends Shape implements Drawable{
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + area);
    }
    void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
    public void draw(){
        System.out.println("Drawing a circle..");
    }
}

class Rectangle extends Shape implements Drawable{
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
    void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
    public void draw(){
        System.out.println("Drawing a rectangle..");
    }
}

class Triangle extends Shape implements Drawable{
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
    void perimeter() {
        double perimeter = 3 * base;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
    public void draw(){
        System.out.println("Drawing a triangle..");
    }
}

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape: 1 for Circle, 2 for Rectangle, 3 for Triangle");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.println("Enter the length and width of the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 3:
                System.out.println("Enter the base and height of the triangle:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 for Circle, 2 for Rectangle, 3 for Triangle");
                System.exit(0);
        }

        shape.area();
        shape.perimeter();
        if (shape instanceof Drawable) {
            ((Drawable) shape).draw();
        }
    }
}
