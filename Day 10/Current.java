import java.util.InputMismatchException;
import java.util.Scanner;

public class Current {
    private int userID;
    private int accID;
    private double balance;
    private String Name;
    private int pwd;
    static Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return "Current [userID=" + userID + ", accID=" + accID + ", balance=" + balance + ", Name=" + Name + ", pwd="
                + pwd + "]";
    }

    public Current(int userID, int accID, String name, int pwd2, double balance) {
        this.userID = userID;
        this.accID = accID;
        Name = name;
        this.pwd = pwd2;
        this.balance = balance;
    }

    public int getUserID() {
        return userID;
    }

    public int getAccID() {
        return accID;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return Name;
    }

    public int getPwd() {
        return pwd;
    }

    void Umenu() {
        int um = 0;
        do {
            try {

                System.out.println("Which Operations You want to perform ");
                System.out.println("Press 1.) Change Your Name ");
                System.out.println("Press 2.) Change Your Password   ");
                System.out.println("Press 6.) Logout ");
                um = sc.nextInt();
                switch (um) {
                    case (1) -> {
                        System.out.println("Enter Amount of Money You Want To Withdraw ");
                    }
                    case (2) -> {
                        System.out.println("Enter Amount of Money You Want To Deposit ");
                    }
                    case (6) -> {
                        System.out.println("You are Logging out. ");
                    }
                    default -> System.out.println("Enter From Given Values ");
                }
            } catch (InputMismatchException ie) {
                System.out.println("Please Enter Proper Responses " + ie);
                ie.getStackTrace();
            }

        } while (um != 5);
    }

}

class Savings extends Current {

    public Savings(int userID, int accID, String name, int pwd2, double balance) {
        super(userID, accID, name, pwd2, balance);
    }

}
