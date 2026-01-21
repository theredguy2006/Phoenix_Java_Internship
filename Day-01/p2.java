// Grade Calculator 

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Your marks  ");
        int a = sc.nextInt();
        if (a >= 90 && a<=100) {
            System.out.println(" Your Grade is A ");
        } else if (a >= 70 && a < 90) {
            System.out.println(" Your Grade is B ");
        } else if (a >= 50 && a < 70) {
            System.out.println(" Your Grade is C ");
        } else if (a >= 35 && a < 50) {
            System.out.println(" Your Grade is D ");
        } else if (a < 35) {
            System.out.println(" Your Grade is F ");
        }
        else
        {
            System.out.println(" Enter Marks in Rnage of 0-100 ");
        }
        sc.close();

    }

}
