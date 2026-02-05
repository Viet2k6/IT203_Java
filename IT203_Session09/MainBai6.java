import java.util.ArrayList;
import java.util.List;
abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}

public class MainBai6 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6));
        double totalArea = 0;
        int index = 1;
        System.out.println("Kết quả tính toán hình học:\n");
        for (Shape s : shapes) {
            double area = s.calculateArea();
            totalArea += area;
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println(index + ". Hình tròn (r=" + c.getRadius() + ") - Diện tích: " + String.format("%.2f", area));
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.getWidth() == r.getHeight()) {
                    System.out.println(index + ". Hình vuông (cạnh " + r.getWidth() + ") - Diện tích: " + area);
                } else {
                    System.out.println(index + ". Hình chữ nhật (" + r.getWidth() + " x " + r.getHeight() + ") - Diện tích: " + area);
                }
            }
            index++;
        }
        System.out.println("\n=> Tổng diện tích các hình: " +
                String.format("%.2f", totalArea));
    }
}
