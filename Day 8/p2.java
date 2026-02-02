import java.util.Scanner;

public class p2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean m = true;
        int a;
        BankAccount ab = new BankAccount(10000, "Kaif ", "Why not ");
        do {
            menu();
            int m1 = sc.nextInt();
            switch (m1) {
                case 1:
                    System.out.println(" Enter amount you want to desposit ");
                    a = sc.nextInt();
                    ab.deposit(a);
                    break;
                case 2:
                    System.out.println(" Enter amount you want to withdraw  ");
                    a = sc.nextInt();
                    ab.withdraw(a);

                    break;
                case 3:
                    System.out.println(
                            " Account Holder's Name " + ab.getName() + " Current Balance " + ab.getOrCheckBalance());

                    break;
                case 4:
                    System.out.println(" You are exiting Bye !!! ");
                    m = false;
                    break;
                default:
                    System.out.println(" Enter Value from the menu .");
                    break;
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
    // balance and name are attributes of this class.
    int balance;
    String name;

    static String bankname; // nothing much use of this just to see and work with satic variables.
    // The above following is a instance variable it can be used throughout the
    // class.

    // this is constructor here we will initalize our attributes for that particular
    // class.

    // Here "a" is a parameter or argument
    // Kinda like setting mthod. if we remove the adding part an sop portion.
    public void deposit(int a) {
        this.balance += a;
        System.out.println("Your Balance is " + this.balance);

    }

    // Not necessarily a setter method but it is kind of like this.
    public BankAccount(int balance, String name, String bankname) {
        this.balance = balance;
        this.name = name;
        bankname = bankname;
    }

    public void withdraw(int a) {
        System.out.println("Your Balance was " + this.balance);
        if (a > this.balance) {
            System.out.println(" You do not have enough balance!! " + this.balance);
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