import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    Runnable autoSave;
    static Scanner sc = new Scanner(System.in);
    Current user;

    boolean operation; // To check while printing whether it is for deposti or withdraw.
    // true for withdraw
    // false for deposit
    File f;
    String fileName;

    public Bank(Current user, Runnable autoSave) {
        this.user = user;
        this.autoSave = autoSave;
        this.fileName = Integer.toString(user.getAccID()) + "_" + Integer.toString(user.getUserID())
                + "passbook.txt";
        new File("Transactions").mkdirs();

        this.f = new File("Transactions/" + fileName);
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
                            operation = true;
                            autoSave.run();
                            printTransactionHistory(user, operation, withDraw);
                        }

                    }
                    case (2) -> {
                        System.out.println("Enter Amount of Money You Want To Deposit ");
                        double depo = sc.nextDouble();
                        System.out.println("Previous Balance in Your Account " + user.getBalance());
                        user.setBalance(depo + user.getBalance());
                        System.out.println("Current/updated Balance in Account " + user.getBalance());
                        operation = false;
                        autoSave.run();
                        printTransactionHistory(user, operation, depo);

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
                try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                }

            } else {
                System.out.println("Debuggin Messgae Check that the file is there or the syntax is working. ");
            }

        } catch (IOException e) {
            System.out.println("IO Exception in Bank's Print History Method " + e);
            e.getStackTrace();
        }

    }

    void printTransactionHistory(Current user, boolean operation, double amount) {
        // If true than the operation was withdraw else false.
        if (operation) {
            try {
                BufferedWriter br = new BufferedWriter(new FileWriter(f, true));
                br.write(amount + " Amount Withdrawed at " + LocalDateTime.now() + "Updated Amount is "
                        + user.getBalance());
                br.newLine();
                br.close();
            } catch (IOException e) {
                System.out.println("IO Exception in Bank's Print History Method " + e);
                e.getStackTrace();
            }

        } else {
            try {
                BufferedWriter br = new BufferedWriter(new FileWriter(f, true));
                br.write(amount + " Amount Deposited  at " + LocalDateTime.now() + "Updated Amount is "
                        + user.getBalance());
                br.newLine();
                br.close();
            } catch (IOException e) {
                System.out.println("IO Exception in Bank's Print History Method " + e);
                e.getStackTrace();
            }

        }

    }

}
