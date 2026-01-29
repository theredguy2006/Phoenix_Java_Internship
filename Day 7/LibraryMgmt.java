import java.util.Scanner;

class LibraryMgmt{
    static Scanner sc = new Scanner(System.in);
    static int bID = 0;
    static int mID = 0;
    static int pID = 0;

    public static void main(String[] args) {

        Member[] members = new Member[5];
        PremiumMember[] premiumMembers = new PremiumMember[3];
        Book[] books = new Book[5];

        members[mID++] = new Member("Kaif", 1234);
        members[mID++] = new Member("Kaif2", 1234);
        members[mID++] = new Member("Kaif3", 1234);

        books[bID] = new Book("Anxious People", "Frederick Backman", bID++);
        books[bID] = new Book("Project Hail Mary", "Andy Weir", bID++);
        books[bID] = new Book("The Shining", "Stephen King", bID++);
        books[bID] = new Book("Normal People", "Sally Rooney", bID++);

        premiumMembers[pID++] = new PremiumMember("PKaif2", 1234);
        premiumMembers[pID++] = new PremiumMember("PKaif3", 1234);

        int choice;

        do {
            System.out.println("\nPress 1 to Login");
            System.out.println("Press 2 to Register");
            System.out.println("Press 3 to Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> login(members, premiumMembers, books);
                case 2 -> register(members, premiumMembers);
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option");
            }

        } while (choice != 3);
    }

    static void login(Member[] m, PremiumMember[] pm, Book[] books) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Password: ");
        int pwd = sc.nextInt();
        sc.nextLine();

        for (Member i : m) {
            if (i != null && i.Name.equals(name) && i.pwd == pwd) {
                System.out.println("Login Successful");
                i.menu(books);
                return;
            }
        }

        for (PremiumMember i : pm) {
            if (i != null && i.Name.equals(name) && i.pwd == pwd) {
                System.out.println("Login Successful");
                i.menu(books);
                return;
            }
        }

        System.out.println("Invalid credentials");
    }

    static void register(Member[] m, PremiumMember[] pm) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Password: ");
        int pwd = sc.nextInt();
        sc.nextLine();

        System.out.println("Press 1 for Premium, any other key for Normal");
        int c = sc.nextInt();
        sc.nextLine();

        if (c == 1 && pID < pm.length) {
            pm[pID++] = new PremiumMember(name, pwd);
        } else if (mID < m.length) {
            m[mID++] = new Member(name, pwd);
        } else {
            System.out.println("Registration full");
        }
    }
}

/* ================= MEMBERS ================= */

class PremiumMember {
    String Name;
    int pwd;
    Book[] taken = new Book[3];
    int count = 0;

    PremiumMember(String n, int p) {
        Name = n;
        pwd = p;
    }

    void menu(Book[] books) {
        int ch;
        do {
            System.out.println("\n1. My Books");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Donate Book");
            System.out.println("5. Logout");

            ch = LibraryMgmt.sc.nextInt();
            LibraryMgmt.sc.nextLine();

            switch (ch) {
                case 1 -> showTaken();
                case 2 -> showBooks(books);
                case 3 -> borrow(books);
                case 4 -> donate(books);
            }

        } while (ch != 5);
    }

    void showBooks(Book[] books) {
        for (Book b : books) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }

    void borrow(Book[] books) {
        if (count >= taken.length) {
            System.out.println("Limit reached");
            return;
        }

        showBooks(books);
        System.out.print("Enter Book ID: ");
        int id = LibraryMgmt.sc.nextInt();
        LibraryMgmt.sc.nextLine();

        for (Book b : books) {
            if (b != null && b.bookID == id && !b.isBorrowed) {
                b.isBorrowed = true;
                b.borrowedBy = Name;
                taken[count++] = b;
                System.out.println("Book Issued");
                return;
            }
        }

        System.out.println("Invalid ID");
    }

    void donate(Book[] books) {
        if (LibraryMgmt.bID >= books.length) {
            System.out.println("LibraryMgmt full");
            return;
        }

        System.out.print("Book Name: ");
        String n = LibraryMgmt.sc.nextLine();

        System.out.print("Author: ");
        String a = LibraryMgmt.sc.nextLine();

        books[LibraryMgmt.bID] = new Book(n, a, LibraryMgmt.bID++);
        System.out.println("Book donated");
    }

    void showTaken() {
        if (count == 0) {
            System.out.println("No books taken");
            return;
        }
        for (Book b : taken) {
            if (b != null) System.out.println(b);
        }
    }
}

class Member extends PremiumMember {
    Book takenBook;
    boolean hasBook = false;

    Member(String n, int p) {
        super(n, p);
    }

    @Override
    void borrow(Book[] books) {
        if (hasBook) {
            System.out.println("Already borrowed one book");
            return;
        }

        showBooks(books);
        System.out.print("Enter Book ID: ");
        int id = LibraryMgmt.sc.nextInt();
        LibraryMgmt.sc.nextLine();

        for (Book b : books) {
            if (b != null && b.bookID == id && !b.isBorrowed) {
                b.isBorrowed = true;
                b.borrowedBy = Name;
                takenBook = b;
                hasBook = true;
                System.out.println("Book Issued");
                return;
            }
        }

        System.out.println("Invalid ID");
    }

    @Override
    void showTaken() {
        if (!hasBook) {
            System.out.println("No book taken");
        } else {
            System.out.println(takenBook);
        }
    }
}

/* ================= BOOK ================= */

class Book {
    String bookName;
    String authorName;
    int bookID;
    boolean isBorrowed = false;
    String borrowedBy;

    Book(String n, String a, int id) {
        bookName = n;
        authorName = a;
        bookID = id;
    }

    public String toString() {
        return "ID: " + bookID + " | " + bookName + " by " + authorName +
               (isBorrowed ? " (Borrowed by " + borrowedBy + ")" : " (Available)");
    }
}

// import java.util.Scanner;

// public class LibraryMgmt {
// static Member[] m = new Member[5];
// static PremiumMember[] pm = new PremiumMember[2];
// static Book[] bo = new Book[5];
// static Scanner sc = new Scanner(System.in);
// static int mi = 3;
// static int pi = 0;
// static int bi = 0;

// public static void main(String[] args) {
// int a = 0;

// m[0] = new Member("Kaif", 1234);
// m[1] = new Member("Kaif2", 1234);
// m[2] = new Member("Kaif3", 1234);
// bo[0] = new Book("Anxious People", "Freidrick Backaman ", bi++);
// bo[1] = new Book("Project Hail Mary ", "Andy Weir ", bi++);
// bo[3] = new Book("The Shining ", "Stephen King ", bi++);

// do {
// System.out.println("Press 1 to Login ");
// System.out.println("Press 2 to Regsister ");
// a = sc.nextInt();
// switch (a) {
// case 1:
// login();
// break;
// case 2:
// Regsister();
// break;
// default:
// System.out.println("Non Premium Members ");
// for (Member i : m) {
// if (i == null)
// continue;

// System.out.println("Name--> " + i.Name);
// System.out.println("PWD--> " + i.pwd);
// }
// for (PremiumMember i : pm) {
// if (i == null)
// continue;

// System.out.println("Name-->" + i.Name);
// System.out.println("PWD-->" + i.pwd);
// }
// for (Book i : bo) {
// if (i == null)
// continue;

// System.out.println("Name--> " + i.bookName);
// System.out.println("AUthor Name --> " + i.authorName);
// System.out.println("Book Id --> " + i.bookID);
// }
// break;
// }
// } while (a != 3);
// sc.close();
// }

// static void login() {
// System.out.println("Enter Your Name ");
// String name = sc.next();
// System.out.println("Enter Your Password ");
// int pwd = sc.nextInt();
// for (Member i : m) {
// if (i == null)
// continue;
// if (i.Name.equals(name) && i.pwd == pwd) {
// System.out.println("Login Sucessful ");
// Menu();

// }
// }
// for (PremiumMember i : pm) {
// if (i == null)
// continue;
// if (i.Name.equals(name) && i.pwd == pwd) {
// System.out.println("Login Sucessful ");
// Menu();
// }

// }

// }

// static void Regsister() {
// System.out.println("Enter Your Name ");
// String name = sc.next();
// boolean userExist = false;
// for (Member i : m) {
// if (i == null)
// continue;
// if (i.Name.equals(name)) {
// userExist = true;
// System.out.println("You cannot login with that Username ");
// break;

// }
// }
// for (PremiumMember i : pm) {
// if (i == null)
// continue;
// if (i.Name.equals(name)) {
// userExist = true;
// System.out.println("You cannot login with that Username ");
// break;
// }

// }
// if (!userExist) {
// System.out.println("Enter Your Password(Numeric Only)");
// int b = sc.nextInt();
// System.out.println("Do you want to be a premium user ? \n Press 1.) For Yes
// \n Press Other Number for No ");
// int c = sc.nextInt();
// if (c == 1) {
// pm[pi++] = new PremiumMember(name, b);
// } else {
// m[mi++] = new Member(name, b);

// }
// }
// }

// static void Menu() {
// int key = 0;

// do {
// System.out.println("1.) Issue a book ");
// System.out.println("2.) Donate a book ");
// System.out.println("3.) Check which book you have borrowed ");
// System.out.println("4.) Exit ");
// key = sc.nextInt();

// switch (key) {
// case 1:

// break;
// default:
// System.out.println("Enter From Above Chosen Options ");
// }
// } while (key != 4);
// }
// }

// class Member {
// int id;
// String Name;
// int pwd;
// boolean isPremium;

// public Member(String name, int pwd) {
// Name = name;
// this.pwd = pwd;
// this.isPremium = false;
// }

// }

// class PremiumMember extends Member {
// int id;
// String Name;
// int pwd;
// boolean isPremium;

// public PremiumMember(String name, int pwd) {
// super(name, pwd);
// this.Name = name;
// this.pwd = pwd;
// this.isPremium = true;
// }

// }

// class Book {

// String bookName;
// String authorName;
// int bookID;
// boolean isBorrowed;
// int borrowedBy;

// public Book(String bookName, String authorName, int bookID) {
// this.bookName = bookName;
// this.authorName = authorName;
// this.bookID = bookID;
// }

// }
