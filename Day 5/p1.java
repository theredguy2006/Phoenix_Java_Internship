public class p1 {
    public static void main(String[] args) {
        // In this program i am gonna study inheritance, super keyword and method
        // overloading.
        // grandFather G = new grandFather(100);
        // father F = new father(50);
        // son S = new son(25);
        grandFather G = new grandFather();
        father F = new father();
        son S = new son();
        daughter D = new daughter();
        System.out.println(" \n Calling role 1 from every class ");
        G.role1();
        F.role1();
        S.role1();

        System.out.println(" \n Calling role 2 from every class ");
        // G.role2();This will give error
        F.role2();
        S.role2();

        System.out.println(" \n Calling role 3 from every class ");
        // G.role3(); This will also give error .
        // F.role3(); This will also give error .
        S.role3();

        // So how does this work.
        // Using the analogy of grandfather and other 2 classes's example.
        // Grand father leaves his heritance for his children which is the father.
        // Father leaves inheritance for his son.
        // So basically son will get the inheritance of both father and grandather but
        // the order cannot be reversed in the context of inheritance.

        // The inheritance i performed here with Grandfather to Son was multilevel.

        // The inheritance i performed here with Father to (Daughter & Son) was
        // multilevel.

    }

}

class grandFather {
    // int m;

    // public grandFather(int m) {
    // this.m = m;
    // }

    public void role1() {
        System.out.println(" This can be accessed by both father and son class. ");

    }

}

class father extends grandFather {
    // int m2;

    // public father(int m) {
    // super(m);
    // this.m2 += m;
    // System.out.println("Inheritance of father " + m2);
    // }

    public void role2() {

        System.out.println(" This can be accessed by son class too .");

    }

}

class son extends father {
    // int m3;

    // public son(int m2) {

    // // What i was trying to do here was that
    // // Grandfather's inheritance will be passed to father and father to son. so
    // as a
    // // result there will be addition and the total will be printed in son's class
    // // but that was wrong.
    // // What's happening is that the super keyword is calling the constrcutor of
    // // superclass performing it and then with processed that happened comes back
    // to
    // // the current and proceeds on.
    // super(m2);
    // // System.out.println(" inheritance given by father " + m2);
    // this.m3 += super.m2;
    // System.out.println("Inheritance of Son " + m3);
    // }

    public void role3() {
        System.out.println("This method can only be accesed by the son class .");
    }
}

class daughter extends father {

    public void role3() {
        System.out.println("This method can only be accesed by the son class .");
    }

}

// Since this program is already very messy and confusing shifting to another
// one to learn only about the super keyword and how exactly does that work.