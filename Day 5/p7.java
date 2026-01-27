import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        shape s1 = new sqaure(5);
        shape s2 = new rectangle(4, 6);
        shape s3 = new triangle(4, 5);
        shape s4 = new circle(7);

        System.out.println("Square Area: " + s1.getArea());
        System.out.println("Rectangle Area: " + s2.getArea());
        System.out.println("Triangle Area: " + s3.getArea());
        System.out.println("Circle Area: " + s4.getArea());

        sc.close();
    }
}

class shape {
    double getArea() {
        return 0;
    }
}

class sqaure extends shape {
    int a;

    sqaure(int a) {
        this.a = a;
    }

    @Override
    double getArea() {
        return Math.pow(a, 2);
    }
}

class rectangle extends shape {
    int a, b;

    rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class triangle extends shape {
    int a, b;

    triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return 0.5 * a * b;
    }
}

class circle extends shape {
    int r;

    circle(int r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return 3.14 * r * r;
    }
}
