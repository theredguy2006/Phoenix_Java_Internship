import java.util.Scanner;

public class p3 {
    // Learning super keyword once again and method overloading and over riding too.
    public static void main(String[] args) {
        son s = new son();

        // nor error will work fine cause we have explicitly written a blank constructor
        son S = new son(200);
        S.money();

    }

}

class grandFather {
    static Scanner sc = new Scanner(System.in);
    int money1;

    public grandFather() {
        // not much use only to given to avoid error of constructor and all.
    }

    public grandFather(int money1) {
        this.money1 = money1;
    }

    public void money() {
        System.out.println(" Grandfather's money " + (money1 + 200));
    }

}

class father extends grandFather {
    int money2;

    public father(int money2) {
        super(money2);
        this.money2 = money2;
    }

    public father() {
    }

    public void money() {

        System.out.println(" Father's money " + (money2 + 100));
        super.money();
    }

    public void money(int a) {

        System.out.println(" Father's money via method overloading  " + (money2 - a));
        super.money();
    }

}

class son extends father {

    int money3;

    public son(int money3) {
        super(money3);
        this.money3 = money3;
        System.out.println(" Money in constructor " + money3);
        // super(money3+money3); This will error as super if calling a constructor or
        // method should be called first in the program

    }

    public son() {
        System.out.println(" Blank Constructor of Son called. ");
    }

    // override annotations is one of many annotations used to improve readability
    // of code and for override annotation it will give error if the method is not
    // overidden
    @Override
    public void money() {
        // super(); we can use super only in terms of constructor this way. however we
        // can.
        System.out.println(" Son's money " + this.money3);
        System.out.println("Enter how much money you want to inherit from father ");
        int a = sc.nextInt();
        // super.money();
        super.money(a);
        // this was kinda an example of method overloading. like despite having the same
        // the other method will be called cause of different parameters this works in
        // main class and other classe.
        // also as we have seen it works for constructors too.
    }
    
    // p3.java:93: error: method does not override or implement a method from a
    // supertype
    // @Override
    // ^
    // 1 error
    // error: compilation failed
    // @Override
    // void noOveride()
    // {
    // System.out.println("Unreachable Code ??");
    // }

}

// so from the program we understand that first the compiler will go to main and
// then the constructor of student and then above and above.
// super.money();
// System.out.println(" Son's money " + this.money3);

// However if we would have done this it would first go son's money see super
// being called then go father's money see super being and then go to
// grandfather perform the task go to father perform the task and then student.

// Constructors go from parent first and then to child. parent must be
// initialized first.

// in this program the money() method is an example of method overiding.