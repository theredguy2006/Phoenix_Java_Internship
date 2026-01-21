import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        // Trying now for patterns with alphabets and digits.
        System.out.println(" Enter No of Rows ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= a; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // implementing alphabets
        char c = 'a';
        for (int i = 1; i <= a; i++) {
            c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= a; j++) {
                System.out.print(c + " ");
                c++;
            }

            System.out.println();
        }
        for (int i = 1; i <= a; i++) {
            c = 'A';
            for (int j = i; j <= a; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }

        // Triangle Star Pattern
        for (int i = 1; i <= a; i++) {
            // leften side space 
            for (int j = i; j < a; j++) {
                System.out.print("  ");
            }
            // for leften side 
            for (int j = 1; j <= i; j++) {
                if (i == a) {
                    System.out.print("* ");
                    continue;
                }
                if (j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                // System.out.print(j + " ");

            }
            // righten side 
            for (int j = 1; j < i; j++) {
                if (i == a) {
                    System.out.print("* ");
                    continue;
                }
                if ((j + 1) == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }

}
