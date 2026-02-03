import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter word to count (type Exit to quit): ");
            String word = sc.nextLine();

            if (word.equalsIgnoreCase("Exit")) {
                break;
            }

            int count = 0;

            try (BufferedReader br = new BufferedReader(new FileReader("demo.text"))) {

                String line;

                while ((line = br.readLine()) != null) {

                    // split line into words
                    String[] words = line.split("\\s+");

                    for (String w : words) {
                        if (w.equalsIgnoreCase(word)) {
                            count++;
                        }
                    }
                }

            } catch (IOException ie) {
                System.out.println("IO error: " + ie);
            }

            System.out.println("Count of '" + word + "' = " + count);
        }

        sc.close();
        System.out.println("Program exited.");
    }
}
