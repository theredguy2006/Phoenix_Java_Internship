
import java.util.Scanner;

public class LibraryMgmt {
    static Member[] m = new Member[10];
    static PremiumMember[] pm = new PremiumMember[5];
    static Scanner sc = new Scanner(System.in);
    static int mi = 3;
    static int pi = 0;

    public static void main(String[] args) {
        int a = 0;

        m[0] = new Member("Kaif", 1234);
        m[1] = new Member("Kaif2", 1234);
        m[2] = new Member("Kaif3", 1234);

        do {
            System.out.println("Press 1 to Login ");
            System.out.println("Press 2 to Regsister ");
            a = sc.nextInt();
            if (a == 1) {
                login();

            } else if (a == 2) {
                Regsister();
            } else {
                System.out.println("Non Premium Members ");
                for (Member i : m) {
                    if (i == null)
                        continue;

                    System.out.println("Name--> " + i.Name);
                    System.out.println("PWD--> " + i.pwd);
                }
                for (PremiumMember i : pm) {
                    if (i == null)
                        continue;

                    System.out.println("Name-->" + i.Name);
                    System.out.println("PWD-->" + i.pwd);
                }

            }
        } while (a != 3);
        sc.close();
    }

    static void login() {
        System.out.println("Enter Your Name  ");
        String name = sc.next();
        System.out.println("Enter Your Password  ");
        int pwd = sc.nextInt();
        for (Member i : m) {
            if (i == null)
                continue;
            if (i.Name.equals(name) && i.pwd == pwd) {
                System.out.println("Login Sucessful ");
                Menu();

            }
        }
        for (PremiumMember i : pm) {
            if (i == null)
                continue;
            if (i.Name.equals(name) && i.pwd == pwd) {
                System.out.println("Login Sucessful ");
                Menu();
            }

        }

    }

    static void Regsister() {
        System.out.println("Enter Your Name ");
        String name = sc.next();
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
            int b = sc.nextInt();
            System.out.println("Do you want to be a premium user ? \n Press 1.) For Yes \n Press Other Number for No ");
            int c = sc.nextInt();
            if (c == 1) {
                pm[pi++] = new PremiumMember(name, b);
            } else {
                m[mi++] = new Member(name, b);

            }
        }
    }

    static void Menu() {
        System.out.println("Work In Progress ");
    }
}

class Member {
    int id;
    String Name;
    int pwd;
    boolean isPremium;

    public Member(String name, int pwd) {
        Name = name;
        this.pwd = pwd;
        this.isPremium = false;
    }

}

class PremiumMember extends Member {
    int id;
    String Name;
    int pwd;
    boolean isPremium;

    public PremiumMember(String name, int pwd) {
        super(name, pwd);
        this.Name = name;
        this.pwd = pwd;
        this.isPremium = true;
    }

}
