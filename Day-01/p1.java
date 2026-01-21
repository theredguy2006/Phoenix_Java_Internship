import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter Value of number 1 ");
        int a=sc.nextInt();
        System.out.println(" Enter Value Of number 2");
        int b=sc.nextInt();
        int c;
        do {
            // To use some of the escape sequences
        System.out.println(" Which Operation you want to perform  1.) \bAddition 2.)Subtraction 3.)\"Multiplication\" 4.)'Division'  ");
        System.out.print(" Or else press 0");
        c=sc.nextInt();
        switch (c) {
            case 1:
                // Reason for this different approach is to use loop and use both unary operators for this program 
                for (int i = 0; i < b; i++) {
                    a++;
                }
                System.out.println(" The Addition is "+a);
                break;
            case 2:
                for (int i = 0; i < b; i++) {
                    a--;
                }
                System.out.println(" The Subtraction is "+a);
                break;
            case 3:
                System.out.println(" The Multiplication is "+(a*b));
                break;
            case 4:
               System.out.println(b != 0 ? "The Division is " + (a / b) : "Division not possible as B = 0");
               break;
            case 0:
                System.out.println(" Your are exiting Bye ");
                break;
            default:
                System.out.println(" Enter From the Given Option ");
                break;
        }
            
        } while (c !=0 );
        
        
        sc.close();
    }

}
