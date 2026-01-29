import java.util.Scanner;

class Library {
    static Scanner sc1 = new Scanner(System.in);
    static int bID = 0; // And id variable to count and tack book's id.
    static int pID = 0; // And id variable to count and tack book's id.
    static int mID = 0; // And id variable to count and tack book's id.

    public static void main(String[] args) {

        Member[] m = new Member[5];
        int a = 0;
        PremiumMember[] pm = new PremiumMember[3];
        Book[] bo = new Book[5];
        // int bUnavailable[] = new int[Array.getLength(bo)]; // an array to track which
        // books are taken.
        m[mID++] = new Member("Kaif", 1234);
        m[mID++] = new Member("Kaif2", 1234);
        m[mID++] = new Member("Kaif3", 1234);
        bo[bID] = new Book("Anxious People", "Freidrick Backman ", bID++);
        bo[bID] = new Book("Project Hail Mary ", "Andy Weir ", bID++);
        bo[bID] = new Book("The Shining ", "Stephen King ", bID++);
        bo[bID] = new Book("Normal People  ", "Salley Rooney", bID++);
        pm[pID++] = new PremiumMember("PKaif2", 1234);
        pm[pID++] = new PremiumMember("PKaif3", 1234);
        String name;
        do {
            System.out.println("Press 1 to Login ");
            System.out.println("Press 2 to Regsister ");
            a = sc1.nextInt();
            switch (a) {
                case 2:
                    System.out.println("Enter Your Name ");
                    name = sc1.next();
                    boolean userExist = false;
                    for (Member i : m) {
                        if (i == null)
                            continue;
                        if (i.Name.equals(name)) {
                            userExist = true;
                            System.out.println("You cannot login with that Username ");
                            break;

                        }
                    }
                    for (PremiumMember i : pm) {
                        if (i == null)
                            continue;
                        if (i.Name.equals(name)) {
                            userExist = true;
                            System.out.println("You cannot login with that Username ");
                            break;
                        }

                    }
                    if (!userExist) {
                        System.out.println("Enter Your Password(Numeric Only)");
                        int b = sc1.nextInt();
                        System.out.println(
                                "Do you want to be a premium user ? \n Press 1.) For Yes \n Press Other Number for No ");
                        int c = sc1.nextInt();
                        if (c == 1) {
                            pm[pID++] = new PremiumMember(name, b);
                        } else {
                            m[mID++] = new Member(name, b);

                        }
                    }
                    break;
                case 1:
                    System.out.println("Enter Your Name  ");
                    name = sc1.next();
                    System.out.println("Enter Your Password  ");
                    int pwd = sc1.nextInt();
                    for (Member i : m) {
                        if (i == null)
                            continue;
                        if (i.Name.equals(name) && i.pwd == pwd) {
                            System.out.println("Login Sucessful ");
                            i.Menu(bo);

                        }
                    }
                    for (PremiumMember i : pm) {
                        if (i == null)
                            continue;
                        if (i.Name.equals(name) && i.pwd == pwd) {
                            System.out.println("Login Sucessful ");
                            i.Menu(bo);
                        }

                    }

                    break;
                default:
                    System.out.println("Non Premium Members ");
                    for (Member i : m) {
                        if (i == null)
                            continue;

                        System.out.println("Name--> " + i.Name);
                        System.out.println("PWD--> " + i.pwd);
                        System.out.println("---------");
                    }
                    for (PremiumMember i : pm) {
                        if (i == null)
                            continue;

                        System.out.println("Name-->" + i.Name);
                        System.out.println("PWD-->" + i.pwd);
                        System.out.println("---------");
                    }
                    for (Book i : bo) {
                        if (i == null)
                            continue;

                        System.out.println("Name--> " + i.bookName);
                        System.out.println("Author Name --> " + i.authorName);
                        System.out.println("Book Id --> " + i.bookID);
                        System.out.println("---------");
                    }
                    break;
            }
        } while (a != 3);

    }

}

class PremiumMember {
    String Name;
    Book booksTaken[] = new Book[3];
    int btCounter = 0;
    // Counter to check how many books taken.
    int pwd;
    Book[] bPM;
    // Scanner sc = new Scanner(System.in);
    Library lm = new Library();

    public PremiumMember(String name, int pwd) {
        this.Name = name;
        this.pwd = pwd;
    }

    void Menu(Book[] b) {
        int key;
        this.bPM = b;
        do {
            System.out.println("Press 1.) To See Book you taken.  ");
            System.out.println("Press 2.) To See All books ");
            System.out.println("Press 3.) To Donate a Book  ");
            System.out.println("Press 4.) To Borrow a Book  ");
            System.out.println("Press 5.) To Logout ");
            key = Library.sc1.nextInt();
            Library.sc1.nextLine();
            switch (key) {
                case 1:
                    booksTaken();
                    break;
                case 2:
                    checkAvailableBooks();
                    break;
                case 3:
                    donateBook();
                    break;
                case 4:
                    takeBook();
                    break;
                case 5:
                    System.out.println("You are logging out ");
                    break;
                default:
                    System.out.println("Please select from the above option. ");
            }

        } while (key != 5);
    }

    void checkAvailableBooks() {
        for (Book i : bPM) {
            if (i == null)
                continue;
            System.out.println("Name--> " + i.bookName);
            System.out.println("Author Name --> " + i.authorName);
            System.out.println("Book Id --> " + i.bookID);
            System.out.println("---------");
            if (i.isBorrowed) {
                System.out.println("Book is Taken By " + i.borrowedBy);
            } else {
                System.out.println("Available");
            }
        }

    }

    void booksTaken() {
        boolean bookTaken = false;
        for (Book i : booksTaken) {
            if (i == null) {
                continue;
            } else {
                bookTaken = true;
                System.out.println("Name--> " + i.bookName);
                System.out.println("Author Name --> " + i.authorName);
                System.out.println("Book Id --> " + i.bookID);
                System.out.println("---------");

            }

        }
        if (bookTaken) {
            System.out.println("These are the books you have taken ");
        } else {
            System.out.println("You have taken no books. ");
        }

    }

    void takeBook() {
        if (btCounter < booksTaken.length) {

            for (Book i : bPM) {
                if (i == null || i.isBorrowed)
                    continue;

                System.out.println("Name--> " + i.bookName);
                System.out.println("Author Name --> " + i.authorName);
                System.out.println("Book Id --> " + i.bookID);
                System.out.println("---------");
            }

            System.out.println("Enter Id of the Book you want ");
            int boName = Library.sc1.nextInt();
            Library.sc1.nextLine();
            boolean s = false;

            for (Book i : bPM) {
                if (i == null || i.isBorrowed)
                    continue;

                if (boName == i.bookID) {
                    booksTaken[btCounter] = new Book(i.bookName, i.authorName, i.bookID);
                    booksTaken[btCounter].borrowedBy = this.Name;
                    i.isBorrowed = true;
                    i.borrowedBy = this.Name;
                    btCounter++;
                    s = true;
                    break;
                }
            }

            if (s) {
                System.out.println("Book Issued Successfully ");
            } else {
                System.out.println("Invalid Book ID");
            }

        } else {
            System.out.println("You have exceeded the no of books you can take please return one of them ");
        }
    }

    void donateBook() {
        if (lm.bID < bPM.length) {
            Library.sc1.nextLine();
            System.out.println("Enter Name of the book you wanna donate ?");
            String t = Library.sc1.nextLine();
            System.out.println("Enter Author's Name of the book you wanna donate ?");
            String y = Library.sc1.nextLine();
            bPM[lm.bID] = new Book(t, y, lm.bID++);
        } else {
            System.out.println("Thank You For Efforts ");
            System.out.println("Unfortunately we can't accept any more books right now.  ");
        }

    }

}

class Member extends PremiumMember {
    String Name;
    Book bookTaken;
    boolean taken = false;
    int pwd;

    public Member(String name, int pwd) {
        super(name, pwd);
        this.Name = name;
        this.pwd = pwd;
    }

    @Override
    void booksTaken() {
        if (!taken) {
            System.out.println("You have yet to take a book ");
        } else {
            System.out.println(bookTaken);

        }
    }

    void takeBook() {
        if (taken) {
            System.out.println("You have already taken a book ");
            System.out.println("If you want more books try becoming a premium member ");
        } else {
            for (Book i : bPM) {
                if (i == null || i.isBorrowed)
                    continue;

                System.out.println("Name--> " + i.bookName);
                System.out.println("Author Name --> " + i.authorName);
                System.out.println("Book Id --> " + i.bookID);
                System.out.println("---------");
            }

            System.out.println("Enter Id of the Book you want ");
            int boName = Library.sc1.nextInt();
            Library.sc1.nextLine();
            boolean s = false;

            for (Book i : bPM) {
                if (i == null || i.isBorrowed)
                    continue;

                if (boName == i.bookID) {
                    bookTaken = new Book(i.bookName, i.authorName, i.bookID);
                    i.borrowedBy = this.Name;
                    i.isBorrowed = true;
                    taken = true;
                    break;
                }
            }

        }
    }
}

class Book {
    String bookName;
    String authorName;
    int bookID;
    boolean isBorrowed;
    String borrowedBy;

    public Book(String bookName, String authorName, int bookID) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookID = bookID;
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("bookName=").append(bookName);
        sb.append(", authorName=").append(authorName);
        sb.append(", bookID=").append(bookID);
        sb.append(", isBorrowed=").append(isBorrowed);
        sb.append(", borrowedBy=").append(borrowedBy);
        sb.append('}');
        return sb.toString();
    }

}