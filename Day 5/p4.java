public class p4 {
    // in this program learning about chaining constructors , final keyword and over
    // riding methods.
    public static void main(String[] args) {
        person p = new person(10);
        // the reason why the answer is reverse order is it goes from.
        // First constructors which re directs it too second constructor which redirects
        // it to third.
        // it executes third one then returns to second and so on.
        // manager m = new manager();
        final int a = 30;
        // mainly use for when we want a constant value throughtout the whole program.
        System.out.println(" Final value of a " + a);
        manager.just();
        // a=20; will give compilation error
        // m.over1();

    }

}

class person {

    int a;
    int b;

    public person() {
        System.out.println(" Third Constructor is called which is default/empty one ");
    }

    public person(int a) {
        this(a, a);
        this.a = a;
        System.out.println(" The first constructor is called " + a);
    }

    public person(int a, int b) {
        this();
        this.a = a;
        this.b = a * 2;
        System.out.println(" Constructor two is called " + (a + b));
        // this(); This will give error as while super will be allowed only on java 25+
        // and so on. this does not have the same allowance or option yet.
        // the reason for not allowing this to be called first is to ensure that the
        // initialization and hierarchy of inheritance stays correct
        // tho this is not an issue for both this and super in java version 25+.
        // it is kinda relaxed in the sense of that when the parent object is created
        // perfectly

    }

    // focusing on appropriate method over riding.
    void over() {
        System.out.println(" This is over method from person ");
    }

}

class anotherPerson {

}

// class employee extends person anotherPerson { This will give error as a class
// only inherit a single class directly at a time.
class employee extends person {

    @Override
    void over() {
        super.over();
        System.out.println(" This is over method from employee ");
    }

}

// also just because a class is final doesn't mean all it's variables and
// methods are compulsory final

final class manager extends employee {

    void over() {
        super.over();
        System.out.println(" This is over method from manager ");
    }

    static void just() {
        System.out.println(
                " Despite being in a final class that cannot be extended it can be called without creating a object ");
    }

    // @Override
    // void over1() {
    // System.out.println("This will give error as @Overide annotation is used
    // incorrectly ");
    // System.out.println("Only when program is running manually. ");
    // System.out.println(
    // "or when it is called in main. emphasis on called. simply creating manager's
    // object won't give the error ");
    // System.out.println(" This is over method from manager ");
    // }

}

// class asstManager extends manager {

// why do we use final class ---> for security reasons or if we don't want that
// class that to be inherited.

// this will give error as manager is final class and it cannot be inherited
// }

// What is "final" in java
// it is non access modifier in java which basically means unlike access
// modifier it controls additional behaviour instead of their visibility
// "static": as i learned previously it means the variable will stay in that
// class
// only and it can be accesed in different classes without creating their object
// first.

// "final":once intialized it cannot be over written or changed . for class it
// means that it cannot be inherited.

// "abstract" & "synchronized":will learn later


// Completed the mini task of hierachy with proper inheritance in p1 and p2 program in the form of 
// grandFather-->Father--->Son  
