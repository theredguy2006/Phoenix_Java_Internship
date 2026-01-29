
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Member[] m = new Member[5];
        PremiumMember[] pm = new PremiumMember[2];
        Book[] bo = new Book[5];
        m[0] = new Member("Kaif", 1234);
        m[1] = new Member("Kaif2", 1234);
        m[2] = new Member("Kaif3", 1234);
        bo[0] = new Book("Anxious People", "Freidrick Backman ");
        bo[1] = new Book("Project Hail Mary ", "Andy Weir ");
        bo[3] = new Book("The Shining ", "Stephen King ");

    }

}

interface searchable {
    void menu(Member m);

    void login(Member m);

    void register(Member m);

    void borrowBook();

    void donateBook();

    void checkBooks();

    void checkAvailableBooks();
}

interface borrowable {
    void bookBorrowed();

    void bookDonated();

    void bookTracker();
}

class PremiumMember implements searchable {
    Scanner sc = new Scanner(System.in);
    int id;
    String Name;
    int pwd;
    boolean isPremium;

    public PremiumMember(String name, int pwd) {
        this.Name = name;
        this.pwd = pwd;
        this.isPremium = true;
    }

    @Override
    public void login(Member m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void borrowBook() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void donateBook() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void checkBooks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void checkAvailableBooks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void menu(Member m) {
        System.out.println("Welcome to Red's Library ");
        System.out.println("Press 1.) To Login ");
        System.out.println("Press 2.) To Register ");
        System.out.println("-------------------------------");
        System.out.println("Debuggine Portion Comment out later");
        System.out.println("Checking all the Books--->  ");
        System.out.println("Checking all the Members--->  ");
        System.out.println("Checking all the PremiumMembers--->  ");
        int key = sc.nextInt();
        switch (key) {
            case 1:
                this.login(m);

                break;
            case 2:
                this.register(m);
                break;

            default:
                System.out.println("Work in Progress ");
                break;
        }
    }

    @Override
    public void register(Member m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

class Member extends PremiumMember {
    // Scanner sc = new Scanner(System.in);
    // int id;
    // String Name;
    // int pwd;
    // boolean isPremium;
    public Member(String name, int pwd) {
        super(name, pwd);
        this.Name = name;
        this.pwd = pwd;
        this.isPremium = false;
    }

}

class Book implements borrowable {
    String bookName;
    String authorName;
    int bookID;
    boolean isBorrowed;
    int borrowedBy;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public void bookBorrowed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bookDonated() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bookTracker() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
