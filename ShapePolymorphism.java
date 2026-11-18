package q2;

class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }

    void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }

    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {

    void draw() {
        System.out.println("Drawing Triangle");
    }

    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {

    void draw() {
        System.out.println("Drawing Square");
    }

    void erase() {
        System.out.println("Erasing Square");
    }
}

public class ShapePolymorphism {

    public static void main(String[] args) {

        Shape s;

        Circle c = new Circle();
        Triangle t = new Triangle();
        Square sq = new Square();

        s = c;
        s.draw();
        s.erase();

        s = t;
        s.draw();
        s.erase();

        s = sq;
        s.draw();
        s.erase();
    }
}
