// This one focuses on run time polymorphism.

public class p6 {
    public static void main(String[] args) {
        mOR a = new mOR2();
        a.method1();

        // mOR2 b=new mOR(); this will give error as parent cannot access the child's
        // method and values.
        // mOR2 b=new mOR1();same as above.
        mOR1 b = new mOR2();
        b.method1();

        mOR a1 = new mOR1();
        a1.method1();

        System.out.println("Using mOR's object to get the value of mOR1 " + a1.getmOR());
        System.out.println("Using mOR1's object to get the value of mOR2 " + b.getmOR());
        System.out.println("Using mOR's object to get the value of mOR2 " + a.getmOR());

        // Focusing on down casting here.

        // mOR a2=new mOR();
        // mOR1 b1= (mOR1)a2;
        // this will compile successfully but give runtime error.
        // Reason is that it does not change the object but only the reference
        // object objectName=new referenceName();
        // basically referenceName should be same when downcasting.

        mOR a2 = new mOR2();
        mOR2 b1 = (mOR2) a2;

        b1.method1();

        // Using instanceOf operator.

        System.out.println(" is a1 instance of mOR2 " + (a1 instanceof mOR2));
        System.out.println(" is a1 instance of mOR1 " + (a1 instanceof mOR1));
        System.out.println(" is a1 instance of mOR " + (a1 instanceof mOR));
        System.out.println();
        System.out.println(" is a2 instance of mOR2 " + (a2 instanceof mOR2));
        System.out.println(" is a2 instance of mOR1 " + (a2 instanceof mOR1));
        System.out.println(" is a2 instance of mOR " + (a2 instanceof mOR));
        System.out.println();
        mOR a3 = new mOR();
        System.out.println(" is a3 instance of mOR2 " + (a3 instanceof mOR2));
        System.out.println(" is a3 instance of mOR1 " + (a3 instanceof mOR1));
        System.out.println(" is a3 instance of mOR " + (a3 instanceof mOR));
        System.out.println();
        mOR2 a4 = new mOR2();
        System.out.println(" is a4 instance of mOR2 " + (a4 instanceof mOR2));
        System.out.println(" is a4 instance of mOR1 " + (a4 instanceof mOR1));
        System.out.println(" is a4 instance of mOR " + (a4 instanceof mOR));


        // /So basically the way instance of works is that it check the reference of the object. 
        // and if the object is a child of class. then instanceOf would be true for the parent too.

    }

}

class mOR {
    void method1() {
        System.out.println(" This is method of mOR ");
    }

    int getmOR() {
        return 10;
    }

}

class mOR1 extends mOR {
    void method1() {
        System.out.println(" This is method of mOR1 ");
    }

    int getmOR() {
        return 20;
    }

}

class mOR2 extends mOR1 {
    void method1() {
        System.out.println(" This is method of mOR2 ");
    }

    int getmOR() {
        return 30;
    }

}

// Runtime polymorphism : Also know Method overiding or Dynamic method dispatch.
// slower than compile time and inheritance is involved. the call is not
// resolved by the compiler.

// In Program p6. upcasting is used mainly.
