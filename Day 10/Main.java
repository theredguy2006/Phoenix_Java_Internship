import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static File f = new File("user.txt");

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); // For Account Id
        HashMap<Integer, Current> hm = new HashMap<>();
        initializeUsers(hs, hm);
        menu(hs, hm);
        sc.close();
    }

    @SuppressWarnings("UnnecessaryContinue")
    static void menu(HashSet<Integer> hs, HashMap<Integer, Current> hm) {
        int menu = 0;
        int id;
        int pwd ;

        do {
            try {
                System.out.println("Press 1 to Login ");
                System.out.println("Press 2 to Register  ");
                System.out.println("Press 3 to Exit ");
                menu = sc.nextInt();
                switch (menu) {
                    case (1) -> {
                        System.out.println("Please Enter Your Account Id ");
                        id = sc.nextInt();
                        System.out.println("Please Enter Your Password ");
                        pwd = sc.nextInt();
                        if (hs.contains(id)) {
                            Current user = hm.get(id);
                            if (user != null && user.getPwd() == pwd) {
                                System.out.println("Login Successful ");
                                System.out.println("Details of Your account " + user);
                                Bank bank = new Bank(user, () -> {
                                    try {
                                        saveAllUsers(hm);
                                    } catch (IOException e) {
                                        System.out.println("Auto-save failed: " + e);
                                    }
                                });
                                bank.Bmenu();

                            } else {
                                System.out.println("Invalid Password ");
                                System.out.println("You can press 3 to exit. ");
                                System.out.println("You can press 2 to Register  ");
                            }

                        } else {
                            System.out.println("Incorrect Account id ");
                        }
                    }
                    case (2) -> {

                        sc.nextLine();
                        System.out.println("Please Enter Your Name ");
                        String Cname = sc.nextLine();

                        System.out.println("Please Enter Your Password  ");
                        int Cpass = sc.nextInt();

                        Random rn = new Random();
                        int Cuid;

                        do {
                            Cuid = rn.nextInt(1000);
                        } while (hs.contains(Cuid));

                        int Caid = rn.nextInt(1000);

                        if (hs.add(Cuid)) {
                            System.out.println("Assuming you have 1000rs in Account ");

                            // ✅ FILE APPEND FIX
                            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
                                bw.newLine();
                                System.out.println("Do you want a Current Account ");
                                System.out.println("Press 1 for Yes  ");
                                System.out.println("Press 0 to Exit and Ant other digit to choose savings account ");
                                int temp = sc.nextInt();
                                switch (temp) {
                                    case 0 -> {
                                        continue;
                                    }
                                    case 1 -> {
                                        bw.write(Cuid + "," + Caid + "," + Cname + "," + Cpass + ",1000," + "Current");
                                        hm.put(Cuid, new Current(Cuid, Caid, Cname, Cpass, 1000));
                                    }
                                    default -> {
                                        bw.write(Cuid + "," + Caid + "," + Cname + "," + Cpass + ",1000," + "Savings");
                                        hm.put(Cuid, new Savings(Cuid, Caid, Cname, Cpass, 1000));
                                    }
                                }
                                System.out.println("Account Created Successfully. Your ID is " + Cuid);
                            } catch (IOException ie) {
                                System.out.println("IO Exception in Menu while registering " + ie);
                                ie.getStackTrace();
                                sc.nextLine();
                            } catch (InputMismatchException ime) {
                                System.out.println("Please Enter Proper Values ");
                                System.out.println("Input mismatch Exception in Menu while registering " + ime);
                                sc.nextLine();
                            }

                        }
                    }
                    case (3) -> {
                        saveAllUsers(hm);
                        System.out.println("You are exiting Bye Bye ");
                    }
                    default -> System.out.println("Enter from the given Options ");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Please enter numbers only");
                sc.nextLine(); // flush
            } catch (IOException ie) {
                System.out.println("IO Exception in Menu " + ie);
            }

        } while (menu != 3);
    }

    static void initializeUsers(HashSet<Integer> hs, HashMap<Integer, Current> hm) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");

                int uID = Integer.parseInt(words[0]);
                int accID = Integer.parseInt(words[1]);
                int pwd = Integer.parseInt(words[3]);
                double balance = Double.parseDouble(words[4]);
                String acType = words[5];

                if (hs.add(uID)) {
                    if (acType.equalsIgnoreCase("savings")) {
                        hm.put(uID, new Savings(uID, accID, words[2], pwd, balance));
                    }
                    if (acType.equalsIgnoreCase("current")) {
                        hm.put(uID, new Current(uID, accID, words[2], pwd, balance));
                    }
                } else {
                    System.out.println("There are Multiple Users with the same ID Please Debug them.");
                }
            }

            Iterator<Integer> itr = hs.iterator();
            while (itr.hasNext()) {
                int userId = itr.next();
                System.out.println(hm.get(userId));
            }

        } catch (IOException e) {
            System.out.println("File Not Found " + e);
        } catch (NumberFormatException nfe) {
            System.out.println("Number Formatting Error " + nfe);
        } catch (ArrayIndexOutOfBoundsException aibe) {
            System.out.println("Array Index Out of Bound Exception " + aibe);
        }
    }

    static void saveAllUsers(HashMap<Integer, Current> hm) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            for (Current c : hm.values()) { // I know this is error but can't think of stuff.
                bw.write(
                        c.getUserID() + "," +
                                c.getAccID() + "," +
                                c.getName() + "," +
                                c.getPwd() + "," +
                                c.getBalance() + "," +
                                c.getAccountType());
                bw.newLine();
            }
        }
    }

}
