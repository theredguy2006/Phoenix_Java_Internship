public class p3 {
    public static void main(String[] args) {
        Car c = new Car("Ford");
        Bike b = new Bike("BMW");
        System.out.println("Car Name is " + c.getName());
        c.start();
        c.move();
        c.topspeed();
        c.compareToBike();
        System.out.println();
        System.out.println("Bike Name is " + b.getName());
        b.start();
        b.move();
        b.topspeed();

    }

}

interface moveable {
    int bikeSpeed = 120;

    void setName(String n);

    String getName();

    void start();

    void topspeed();

    void move();

}

interface moveableCar extends moveable {
    int carSpeed = 200;

    void compareToBike();

}

class Bike implements moveable {
    String name;

    public Bike(String name) {
        this.setName(name);
    }

    public void setName(String n) {
        name = n;
        // System.out.println(" The Bike name is " + this.name);
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("The Bike is starting. ");
    }

    public void topspeed() {
        System.out.println("The Top speed of bike is " + 120 + " km/hr ");
    }

    public void move() {
        System.out.println("Your bike "+this.getName()+"is moving.");
    }

}

class Car implements moveableCar {
    String name;

    public Car(String name) {
        this.setName(name);
    }

    public void setName(String n) {
        name = n;
        // System.out.println(" The Car name is " + this.name);
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("The Car is starting. ");
    }

    public void topspeed() {
        System.out.println("The Top speed of Car is " + 120 + " km/hr ");
    }

    public void move() {
        System.out.println("Your car " + this.getName() + " is moving.");
    }

    public void compareToBike() {
        System.out.println("Compared to Bike the car has top speed " + (carSpeed - bikeSpeed));
        System.out.println("It has 4 seats also . ");
    }

}
