
// In this program i am gonna learn about abstract classes and methods. 

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        // vehicle vc=new vehicle("Ford");
        // this will give error as i said that abstract classes cannot be instantiated.
        // car ca = new car("ford");
        // System.out.println("The name of the car is " + ca.getName());
        // ca.noOfWheels(4);
        // ca.noChange(); // This can work with no issue as we calling it via car and
        // not changing it.

    }
}

// Things an abstract class can have : constructors, non abstract/concrete
// methods , instance variable , abstract methods , statis and final methods.
abstract class vehicle {
    Scanner sc = new Scanner(System.in);
    int a;

    private String name;
    // Instance variable

    public vehicle(String name) {
        this.setName(name);
        // This is not required and not necessary but doing it this way to revise and
        // use encapsulation priniciple

    }

    public void setName(String s) {
        this.name = s.concat("parent");
    }

    abstract String getName();

    abstract void noOfWheels(int a);

    static void Helper() {
        System.out.println(
                "Just showing that we can use static methods too . ");
    }

    final void noChange() {
        System.out.println("This is a final method. " + name);
    }

    abstract void rims();
    // this is just a place holder.

    // So what i am doin here is creating an method that won't be implemented by
    // car.
    // This will give error. So what we can do prevent is.
    // make car an abstact class too .
    // then implement that method in tyre.

}

abstract class car extends vehicle {
    // class car extends vehicle {
    String name;
    int a;

    public car(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    public void setName(String s) {
        this.name = s;
    }

    String getName() {
        return this.name;
    }

    void noOfWheels(int a) {
        System.out.println("The No of wheels are " + a);
        vehicle.Helper();
    }
    // void noChange()
    // {
    // System.out.println(" This will give error ");
    // }

    // abstract void error()
    // {
    // // Also this will compile error
    // System.out.println(" This won't work and give error because if a class has a
    // single abstact method it should be made abstract .");
    // }

}

class tyre extends car {
    String name;

    public tyre(String name) {
        super(name);
    }

    void rims() {
        System.out.println("this is rims. ");
    }
}


// Why do we use abtract classes really ??
// Answer : well the technical answer is that when we need a blueprint that should be 100% followed by the child class.
// like we need some methods that are gonna be used again and again in so it makes sense to create abstract class.
// the analogy i read online explains it best.
// we know all humans greet but we don't how they are gonna greet whether it can be namaste or hola amigo. we don't know for sure 
// what we do know is that humans will greet for sure.
// so we create an abstract class human whose child class will be let's indian 
// so how will an indian greet someone most probably by saying namaste.
// now we create an american class. how will he greet someone by saying hello.  

// Why do abstact class have constructor despite never being instantiated ??
// Ans: Constructors are used sometimes to initialize values or instance
// variables. Also it can be used to ensure that the child classes also follow
// this pattern when they will be instantiated