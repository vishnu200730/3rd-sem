class Shape {

    double area() {
        return 0;
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Main class
class MainShape {
    public static void main(String[] args) {

        // Creating Shape array
        Shape[] s = new Shape[3];

        // Storing subclass objects
        s[0] = new Circle(5);
        s[1] = new Rectangle(10, 5);
        s[2] = new Triangle(8, 6);

        // Calling area() using loop
        for (int i = 0; i < s.length; i++) {
            System.out.println("Area: " + s[i].area());
        }
    }
}
