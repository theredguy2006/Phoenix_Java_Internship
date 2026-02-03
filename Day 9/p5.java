import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p5 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String line;

            while (true) {

                // Read all new lines that exist right now
                while ((line = br.readLine()) != null) {
                    System.out.println("READ -> " + line);
                }

                // No new data yet → wait a bit and try again
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("IO Exception: " + e);
        }
    }
}

// import java.io.*;

// public class p5 {
// public static void main(String[] args) {
// try {
// BufferedWriter bw = new BufferedWriter(new FileWriter("bf.text"));
// BufferedReader br=new BufferedReader(new FileReader("test.text"));
// do
// {
// System.out.println();
// }

// } catch (IOException e) {
// System.out.println("New IOexception "+e);
// }

// }
// }
