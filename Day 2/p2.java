import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        // This Program is to learn patterns and more effective in depth usage and
        // implemenatation of patterns .
        System.out.println(" Enter How Many Rows you want for both increasing in decreasing triangle ");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        int a = 5;
        System.out.println(" Increasing Triangle Till " + a + " Rows ");
        for (int i = 0; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" Decreasing Triangle Till " + a + " Rows ");
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" Right Sided Increasing triangle ");
        for (int i = 1; i <= a; i++) {
            // Loop for decreasing Triangle
            // It will print spaces first and then we will run an increasing triangle to get
            // our pattern
            for (int j = i; j <= a; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right sided Decreasing Triangle
        System.out.println("Right Sided Decreasing Triangle ");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" For Hill Pattern ");
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" Reverse Hill Pattern ");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= a; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < a; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        System.out.println("  Diamond pattern ");
        for (int i = 1; i <a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        // Lower Half of the trianlge
        // System.out.println();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= a; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

        // Printing a 1 0 pattern like this one.
                        // 1
                        // 101
                        // 10101
                        // 1010101
                        // 101010101 
                        // 1010101
                        // 10101
                        // 101
                        // 1 
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                if(j==1)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 1 ");
                }

            }
            System.out.println();

        }
        // Lower half of the pattern  
        for(int i=(a-1);i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                if(j==i)
                {
                System.out.print("1 ");
            }
            else{
                System.out.print("0 1 ");
            }
        }
            System.out.println();
        }

    }

}
