import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {

        try {
            File f = new File("test.txt");
            FileWriter fw = new FileWriter(f, true);
            Scanner sc = new Scanner(System.in);
            String s = "";
            while (!s.equalsIgnoreCase("Exit")) {
                if (s.equalsIgnoreCase("'New'")) {
                    fw.write("  \n");
                } else {
                    fw.write(s);
                }
                if (s.equalsIgnoreCase("delete")) {
                    break;
                }
                System.out.println("Enter Your Words ");
                s = sc.nextLine();

            }
            fw.close();
            if (s.equalsIgnoreCase("delete")) {
                f.delete();
            }
        } catch (IOException ie) {
            System.out.println("Error caught " + ie);
            ie.getStackTrace();
        }

    }

}
