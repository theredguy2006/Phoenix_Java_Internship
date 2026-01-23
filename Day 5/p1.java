import java.util.Scanner;

public class p1 {
    static Scanner sc = new Scanner(System.in);
    int a;
    static int c = 0;

    public static void main(String[] args) {
        int b;
        // Learning about OOPs , it's concept and all
        // The above is an example of an object. made for class p1
        // using this we can use all methods and variable of p1 class
        // obj.a = 10;
        c = 10;
        // System.out.println(" a and c after calling method 1. " + " a " + obj1.a + " c
        // " + c);
        p1 obj1 = new p1();
        obj1.method1();
        System.out.println(" a and c after calling method 1. with object 1 " + " a " + obj1.a + " c " + obj1.c);
        p1 obj2 = new p1();
        obj2.a = 11210;
        obj1.method1();
        System.out.println(" a and c after calling method 1. with object 2 " + " a " + obj2.a + " c " + obj2.c);
        obj2.c = 12;
        System.out.println(
                " Calling a and c with obj1 object despite chaningine it via obj2 c->  " + obj1.c + " a-> " + obj1.a);
        // method1(); This will give error as we are calling a non static method
        // directly
        sMethod1(); // This won't cause error as it is static and static variable and method will
                    // can be
                    // called directly throughout their respective class with no issues.
    }

    public static void menu() {
        System.out.println(" ");

    }

    public void method1() {
        a = 10;

        // b=0; this will give error why ??
        // cause a is instance variable so it can be used anywhere in the class.
        // Meanwhile for b. We need to create an object or atleast create t again in the
        // method .
        // System.out.println(" THis is a method just for example "+a+" B "+b); Error
        // cause of b.
        System.out.println(" THis is a method just for example " + a);
        c = 20;
        // sMethod1();This will give no error and work fine.
    }

    public static void sMethod1() {
        System.out.println(" This is a static method we can call it directly  ");
    }
}
// Conclusion of this program
// 1.) What is object and how to use them and all
// 2.) Difference between instance and static. static is same for every object
// and method , meanwhile instance can be used anywhere in the class but it get
// initialized for every new object
// 3.) Static methods and some idea on how they work. 
