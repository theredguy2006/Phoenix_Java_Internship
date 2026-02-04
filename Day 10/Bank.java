import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);

    void Bmenu() {
        int bm = 0;
        do {
            try {

                System.out.println("Which Operations You want to perform ");
                System.out.println("Press 1.) Withdraw Money  ");
                System.out.println("Press 2.) Deposit Money  ");
                System.out.println("Press 3.) View Your Transaction History  ");
                System.out.println("Press 4.) Print Your Transaction History  ");
                System.out.println("Press 5.) Peform User Based Operations ");
                System.out.println("Press 6.) Logout ");
                bm = sc.nextInt();
                switch (bm) {
                    case (1) -> {
                        System.out.println("Enter Amount of Money You Want To Withdraw ");
                    }
                    case (2) -> {
                        System.out.println("Enter Amount of Money You Want To Deposit ");
                    }
                    case (3) -> {
                        System.out.println("Your Transaction History ");
                    }
                    case (4) -> {
                        System.out.println("Print Your Transaction History ");
                    }
                    case (5) -> {
                        System.out.println("You are Logging out. ");
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

        } while (bm != 5);

    }

}
