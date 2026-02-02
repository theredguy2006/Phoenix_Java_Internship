import java.util.InputMismatchException;
import java.util.Scanner;

public class p2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean m = true;
        int a;
        BankAccount ab = new BankAccount(10000, "Kaif ", "Why not ");

        do {
            try {
                menu();
                int m1 = sc.nextInt();
                switch (m1) {
                    case 1:
                        try {
                            System.out.println(" Enter amount you want to Deposit  ");
                            a = sc.nextInt();
                            ab.deposit(a);
                        } catch (customException ce) {
                            // this will bring the message instead of the error.
                            System.out.println(ce.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println(" Enter amount you want to withdraw  ");
                            a = sc.nextInt();
                            ab.withdraw(a);
                        } catch (customException ce) {
                            System.out.println(ce);
                        }

                        break;
                    case 3:
                        System.out.println(
                                " Account Holder's Name " + ab.getName() + " Current Balance "
                                        + ab.getOrCheckBalance());

                        break;
                    case 4:
                        System.out.println(" You are exiting Bye !!! ");
                        m = false;
                        break;
                    default:
                        System.out.println(" Enter Value from the menu .");
                        break;
                }
            } catch (InputMismatchException im) {
                System.out.println("Input error Please Enter Numeric Value ");
                System.out.println("What is ????");
                sc.nextLine();
            }
        } while (m);

    }

    public static void menu() {
        System.out.println(" Press 1.) To Deposit ");
        System.out.println(" Press 2.) To Withdraw ");
        System.out.println(" Press 3.) To Check Balance  ");
        System.out.println(" Press 4.) To Exit ");

    }

}

class BankAccount {
    int balance;
    String name;

    static String bankname;

    public void deposit(int a) throws customException {
        if (a < 0) {
            throw new customException("You can't deposit -ve valueor amount ");
        }
        this.balance += a;
        System.out.println("Your Balance is " + this.balance);

    }

    public BankAccount(int balance, String name, String bankname) {
        this.balance = balance;
        this.name = name;
        this.bankname = bankname;
    }

    public void withdraw(int a) throws customException {
        System.out.println("Your Balance was " + this.balance);
        if (a > this.balance || a < 0) {
            // throw customException(); this will give error as we can't just throw and
            // error cause the customException has a parametred constructor
            // the "new" is imp as if do not write it will raise an error. cause we need to
            throw new customException("Throwing the Custom Exception for withdrawing more money than you have .");
        } else {

            this.balance -= a;
            System.out.println("After withdrawing " + a);
            System.out.println("Your Balance is " + this.balance);
        }

    }

    // This is kind of get method's example.
    public int getOrCheckBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

}

// Difference between throw and throws

// throw is used to throw the exception required and we intend to in a certain
// case.

// meanwhile throws is like not on ground level but like let's say we know a
// class or method may or will throw some exceptions . so we do class or method
// exys throws xyz exception.
// we can just write throws exception but it is not considered a good practice
// and we should avoid that.
// instead we should write the multiple exception based on the actual content of
// the class or method.

// Custom exceptions in java.
// Basically we can create our own custom exceptions in java by.

class customException extends Exception // Or Runtime depending on requirment
{

    public customException(String message) {
        super(message);
    }

}

// What are the best practices for using exception handling.
// 1.) Use specific excpetion instead of just exception e.
// 2.) Do not just write empty catch blocks to hide the error/exception
// 3.)Use fianlly too if required to document and clean up code.
// 4.) Create custom exception only when you need a specific info or use case.