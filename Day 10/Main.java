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

    static void menu(HashSet<Integer> hs, HashMap<Integer, Current> hm) {
        int menu = 0;
        int id = 0;
        int pwd = 0;

        do {
            try {
                if (id == 0) {
                    System.out.println("Please Enter Your Account Id ");
                    id = sc.nextInt();
                }

                if (pwd == 0) {
                    System.out.println("Please Enter Your Password ");
                    pwd = sc.nextInt();
                }

                if (hs.contains(id)) {
                    Current user = hm.get(id);

                    // ✅ PASSWORD VERIFICATION FIX
                    if (user != null && user.getPwd() == pwd) {
                        System.out.println("Login Successful ");
                        System.out.println("Details of Your account " + user);
                        menu = 3;
                    } else {
                        System.out.println("Invalid Password");
                        // id = 0;
                        pwd = 0;
                    }

                } else {
                    System.out.println("Account not found. ");
                    System.out.println("Do you want to try again or Create a new account ? ");
                    System.out.println("Press 1.) To Try again 2.) Create new account 3.) Exit  ");
                    menu = sc.nextInt();

                    switch (menu) {
                        case 1 -> {
                            id = 0;
                            pwd = 0;
                        }

                        case 3 -> {
                            saveAllUsers(hm);
                            System.out.println("You are exiting Bye Bye ");
                        }

                        case 2 -> {
                            sc.nextLine(); // ✅ consume leftover newline

                            System.out.println("Please Enter Your Name ");
                            String Cname = sc.nextLine();

                            System.out.println("Please Enter Your Password  ");
                            int Cpass = sc.nextInt();

                            Random rn = new Random();
                            int Cuid;

                            // ✅ RANDOM ID COLLISION FIX
                            do {
                                Cuid = rn.nextInt(1000);
                            } while (hs.contains(Cuid));

                            int Caid = rn.nextInt(1000);

                            if (hs.add(Cuid)) {
                                System.out.println("Assuming you have 1000rs in Account ");

                                // ✅ FILE APPEND FIX
                                try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
                                    bw.newLine();
                                    bw.write(Cuid + "," + Caid + "," + Cname + "," + Cpass + ",1000");
                                }

                                hm.put(Cuid, new Current(Cuid, Caid, Cname, Cpass, 1000));
                                System.out.println("Account Created Successfully. Your ID is " + Cuid);
                            }
                        }

                        default -> System.out.println("Please Choose From the below Options ");
                    }
                }

            } catch (InputMismatchException ime) {
                System.out.println("Input Mismatch Error ");
                sc.nextLine();
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

                if (hs.add(uID)) {
                    hm.put(uID, new Current(uID, accID, words[2], pwd, balance));
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
            for (Current c : hm.values()) {
                bw.write(
                        c.getUserID() + "," +
                                c.getAccID() + "," +
                                c.getName() + "," +
                                c.getPwd() + "," +
                                c.getBalance());
                bw.newLine();
            }
        }
    }

}
