import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    Current user;
    String fileName = Integer.toString(user.getAccID()) + "_" + Integer.toString(user.getUserID())
            + "passbook.txt";
    File f = new File("Transactions/" + fileName);
    boolean operation = true; // To check while printing whether it is for deposti or withdraw.
    // true for withdraw
    // false for deposit

    public Bank(Current user) {
        this.user = user;
    }

    void Bmenu() {
        int bm = 0;
        do {
            try {

                System.out.println("Which Operations You want to perform ");
                System.out.println("Press 1.) Withdraw Money  ");
                System.out.println("Press 2.) Deposit Money  ");
                System.out.println("Press 3.) View Your Transaction History  ");
                // System.out.println("Press 4.) Print Your Transaction History ");
                System.out.println("Press 4.) Peform User Based Operations ");
                System.out.println("Press 5.) Logout ");
                bm = sc.nextInt();
                switch (bm) {
                    case (1) -> {
                        System.out.println("Enter Amount of Money You Want To Withdraw ");
                        double withDraw = sc.nextDouble();
                        if (user.getBalance() < withDraw) {
                            System.out.println("Insufficient Balance Please Try Again ");
                        } else if ((user.getBalance() - withDraw) < 1000) {
                            System.out.println("Your account Balance cannot be less than 1000rs ");
                            System.out.println("The Maximum Amonut you can withdraw is  " + (user.getBalance() - 1000));
                        } else {
                            System.out.println("Previous Balance in Your Account " + user.getBalance());
                            user.setBalance(user.getBalance() - withDraw);
                            System.out.println("Current/updated Balance in Account " + user.getBalance());
                            printTransactionHistory(user, operation);
                        }

                    }
                    case (2) -> {
                        System.out.println("Enter Amount of Money You Want To Deposit ");
                        double depo = sc.nextDouble();
                        depo += user.getBalance();
                        System.out.println("Previous Balance in Your Account " + user.getBalance());
                        user.setBalance(depo);
                        System.out.println("Current/updated Balance in Account " + user.getBalance());
                        operation = false;
                        printTransactionHistory(user, operation);

                    }
                    case (3) -> {
                        System.out.println("Your Transaction History ");
                        viewTransactionHistory(user);
                    }
                    // case (4) -> {
                    // System.out.println("Print Your Transaction History ");
                    // printTransactionHistory(user);
                    // }
                    case (4) -> {
                        System.out.println("Redirecting to user based Operations ");
                        user.Umenu();
                    }
                    case (5) -> {
                        System.out.println("You are Logging out. ");
                        return;
                    }
                    default -> System.out.println("Enter From Given Values ");
                }
            } catch (InputMismatchException ie) {
                System.out.println("Please Enter Proper Responses " + ie);
                ie.getStackTrace();
            }

        } while (bm != 5);

    }

    void viewTransactionHistory(Current user) {
        try {
            if (f.exists()) {
            } else {
                System.out.println("Debuggin Messgae Check that the file is there or the syntax is working. ");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    void printTransactionHistory(Current user, boolean operation) {
        // If true than the operation was withdraw else false.
        if (operation) {

        } else {

        }

    }

}
