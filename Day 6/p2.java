public class p2 {
    // In this program i am gonna learn about interface.
    public static void main(String[] args) {
        testInter ti = new testInter();
        System.out.println(" Acessing the a variable " + ti.a);
        ti.method1(12);
        ti.method2();
        testInter2 ti2=new testInter2();
        ti2.example();

    }

}

interface Innerp2 {
    // variable defined in Interface is public , static and final by default.
    int a = 10;

    // a method defined in interface are public & abstract by default.
    void method1(int a);

    void method2();

    // void nullmethod()
    // {
    // System.out.println(" A method cannot have a body in interface nor it can have
    // a constructor ");
    // }
    // Innerp2()
    // {
    // System.out.println(" It cannot have a constructor too ");
    // }

}

interface Innerp2_1 {
    // we can have a single class implmenting multiple interfaces.
    void example();

}

interface Innerp2_2 extends Innerp2_1 {
// interface Innerp2_2 extends Innerp2_1, Innerp2 { This is valid btw. we can totally do that. 

}

// we use "," to seperate multiple interfaces while we are implementing multiple
// ones.
class testInter implements Innerp2, Innerp2_1 {
    // this public is imp here.

    public void method2() {
        System.out.println(" Unless we implement every method of interface it will raise error ");
    }

    public void method1(int a) {
        System.out.println(" This is just a type of method we are doing " + a);
    }

    public void nmethod() {
        System.out.println("Just to show that we can use methods not defined there in interface " + a);
        // just to show we can use a variable from the interface.
        // Since it's static so we use it directly without creating object.

        // however we cannot
        // a=100;
        // System.out.println("Unreachable and error as we are trying to over write a
        // final variable "+a);
    }

    public void nullmethod() {
        // No use as methods cannot have an body in inteface.
    }

    public void example() {
        System.out.println(" Method of Second interface . ");
    }

}

class testInter2 implements Innerp2_2 {

    public void example() {
        System.out.println(
                " Despite implementing Innerp2 we stil need to use example. reason Innep2 is a child of Inner p1 so inheritance is followed here. ");
    }

}

// We can implement multiple interface at a time but we cannot inherit or extend
// multiple classes at a time .

// interface --> interface . we use extends. and we can extend multiple interfaces at a single time.
// interface --> class , we use implement and we can implement >1 interfaces too. 


// What is interface ??
// Why do we need interface and where we use it ???
// What is the difference between interface and abstract classes ??