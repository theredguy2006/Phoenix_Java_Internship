class am {
    // short for public access modifier
    public static int puam() {
        pram();
        System.out.println(" this can be accessed from anywhere in the whole code .");
        return 5;

    }

    // short for private access modifier
    private static void pram() {
        System.out.println(" This is private and it can only be accessd in this class or ");
        System.out.println(" Pass this to a public class and then you can access it. ");
    }

    // For Protected we can access it normally like we do in class but if we had to
    // access it another file package we cannot do it . Unless we inherit or
    // encapsulate it into a
    // public method like pram called via puam.(which is mainly for private but we
    // can do it with protected too)
    // but only contorl their access (meaning who can work with or access  them)

    // Protected is like default but the crucial differences is that protected works
    // in inherited class but default doesn't so as a result we cannot access it
    // into a different package.
}

public class p3 extends am {
    public static void main(String[] args) {
        System.out.println(" Learning about access modifier ");
        System.out.println(" 4 types of access modifiers \n 1.)Public \n 2.)Private \n 3.)Protected \n 4.) Default  ");
        am obj = new am();
        int a = am.puam();
        // am.pram(); Meanwhile this can't be accessed in any other class.
        // obj.pram(); Not even this way.
        System.out.println(" Calling from am 2 ");

    }

}
