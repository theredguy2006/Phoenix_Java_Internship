
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value.");
        int a = sc.nextInt();
        String s = "**";
        for (int i = 1; i <= a; i++) {
            System.out.print(s + " ");
            if (i % 2 == 0)

            {
                // System.out.print("1");
                s = s+"**";
            }
            System.out.println();
        }
    }

}
