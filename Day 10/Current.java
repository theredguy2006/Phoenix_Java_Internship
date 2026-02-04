public class Current {
    private int userID;
    private int accID;
    private double balance;
    private String Name;
    private int pwd;

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

    public double getUserID() {
        return userID;
    }

    public double getAccID() {
        return accID;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return Name;
    }

    public double getPwd() {
        return pwd;
    }

}

class Savings extends Current {

    public Savings(int userID, int accID, String name, int pwd2, double balance) {
        super(userID, accID, name, pwd2, balance);
    }



}
