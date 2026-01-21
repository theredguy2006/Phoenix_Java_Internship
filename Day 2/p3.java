import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        System.out.println(" Enter No for  Factorial & Number whose multiplication you want ");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int fact = 1;
        // for (int i = a; i > 0; i--) {
        // fact = i * fact;
        // }
        // System.out.println(a + "! is " + fact);

        // System.out.println(" Enter Second number to find multiplication till where
        // ");
        // int b = sc.nextInt();
        // for (int i = 1; i <= b; i++) {
        // System.out.println(a + " x " + i + " = " + (a * i));
        // }

        System.out.println(" Enter How many numbers you want for the finonacci sequence ");
        int f1 = 0;
        int f2 = 1;
        int fibo = 0;
        int f = sc.nextInt();
        System.out.println(" Fibonacci sequence till " + f);
        System.out.print(" 0 1 ");
        for (int i = 0; i <= f; i++) {
            fibo = f1 + f2;
            System.out.print(fibo + " ");
            f1 = f2;
            f2 = fibo;

        }

        System.out.println("\n Check whether following number is in finonacci sequence or not ");
        int f3 = sc.nextInt();
        f1 = 0;
        f2 = 1;
        fibo = 0;
        for (int i = 0; i < f3; i++) {
            fibo = f1 + f2;
            // System.out.print(fibo + " ");
            f1 = f2;
            f2 = fibo;
            if (fibo == f3) {
                System.out.println(fibo+" Number is in fibo series");
                break;
            }
        }
        sc.close();
    }

}
