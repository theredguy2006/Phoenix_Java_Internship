import java.util.InputMismatchException;


public class Current  {
    @SuppressWarnings("FieldMayBeFinal")
    private int userID;
    private int accID;
    @SuppressWarnings("FieldMayBeFinal")
    private double balance;
    @SuppressWarnings("FieldMayBeFinal")
    private String Name;
    @SuppressWarnings("FieldMayBeFinal")
    private int pwd;

    public void setBalance(double balance) {
        this.balance = balance;
    }

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

    public void setName(String name) {
        Name = name;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
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
                System.out.println("Press 3.) Check Your Balance ");
                System.out.println("Press 4.) Check Your Account Id ");
                System.out.println("Press 5.) To go Back  ");
                um = Main.sc.nextInt();
                switch (um) {
                    case (1) -> {
                        Main.sc.nextLine();
                        System.out.println("Change Your Name  ");
                        String n = Main.sc.nextLine();
                        setName(n);
                    }
                    case (2) -> {
                        System.out.println("Change Your Password ");
                        int pd = Main.sc.nextInt();
                        setPwd(pd);
                    }
                    case (3) -> {
                        System.out.println("Your account Balance is " + getBalance());
                    }
                    case (4) -> {
                        System.out.println("Your Account Id is " + getAccID());
                    }
                    case (5) -> {
                        System.out.println("You are going back ");
                        return;
                    }
                    default -> System.out.println("Enter From Given Values ");
                }
            } catch (InputMismatchException ie) {
                System.out.println("Please Enter Proper Responses " + ie);
                ie.getStackTrace();
                Main.sc.nextLine();
            }

        } while (um != 5);
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

}

@SuppressWarnings("unused")
class Savings extends Current {

    public Savings(int userID, int accID, String name, int pwd2, double balance) {
        super(userID, accID, name, pwd2, balance);
    }

}
