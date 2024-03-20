class Shape {
    void draw() {
        System.out.println("Menggambar bentuk...");
    }
    
    void draw(String color) {
        System.out.println("Menggambar bentuk berwarna " + color);
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Menggambar lingkaran...");
    }
    
    void draw(double radius) {
        System.out.println("Menggambar lingkaran dengan radius " + radius);
    }
}

public class ShapeTest {
    public static void main(String args[]) {
        Shape shape1 = new Circle();
        shape1.draw();
        shape1.draw("biru");
        
        Circle circle = new Circle();
        circle.draw();
        circle.draw(5.0);
    }
}
