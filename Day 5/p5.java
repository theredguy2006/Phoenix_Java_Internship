// this program focuses on compile time polymorphism.

public class p5 {
    public static void main(String[] args) {
        mOL m1 = new mOL(90);
        mOL m2 = new mOL("kaif");
        m1.OL1();
        m1.OL1("kaif");
        m1.OL1(10, 0);
        // Despite only one variable being double the double method is called at the
        // compile time.
        m1.OL1(10.0, 1);
        // Irrespective of position.
        m1.OL1(10, 1.0);
        // the reason is java allows implicit or basically upper casting int--->double
        // is allowed but double---> is not at least implicitly/automatically so as a
        // result the double would be called

    }

}

class mOL {

    int s;

    public mOL(int s) {
        this.s = s;
        System.out.println("Constructor with int called " + s);
    }

    public mOL(String y) {
        this.y = y;
        System.out.println("Constructor with String Called ." + y);
    }

    String y;

    void OL1() {
        System.out.println("This is the method without variables ");
    }

    void OL1(String s) {
        System.out.println("This is the method with string  variable " + s);
    }

    void OL1(int a, int b) {
        System.out.println("This is the method with int  variables " + (a + b));
    }

    void OL1(double a, double b) {
        System.out.println("This is the method with double  variables " + (a + b));
    }

}
// Compiletime polymorphism : It can also be called method overloading.
// basically what happens is that a method or even constructor has the same
// name.
// so how to differentiate them. unless they both have same parameters it will
// raise and error.
// if they have different parameters the compile will run the one that has
// matching parameters.
// This applies for constructors too btw.
