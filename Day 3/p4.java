import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=1;
        for(int i=1;i<=a;i++)
        {
            t=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=a;j++)
            {
                System.out.print((t++) +" ");
            }
            System.out.println();
        }
        t=1;
        int t2=a;
        // Lower Half of the pyramid 
        for(int i=(a-1);i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=a;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
