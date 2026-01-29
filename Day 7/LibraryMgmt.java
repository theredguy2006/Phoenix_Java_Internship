

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
