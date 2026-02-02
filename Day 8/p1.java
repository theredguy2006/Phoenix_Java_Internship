public class p1 {

    public static void main(String[] args) {
        // basic try catch syntax
        int a = 10;
        int b = 0;
        int[] d = new int[2];

        try {
            String str = null;
            // System.out.println(str.length());
            // So how the program will work ?? Like it will see that there is a nullpointer
            // error here. So what would happen is that since we are in try block . it will
            // search for the nearest and familiar exception it can find in the multiple
            // catch blocks and then execute the catch block and instead of returning in the
            // try block. it will move ahead to the next part of the code out side of the try catch.
            // int c = a / b;
            int d1 = d[10];
            System.out.println("This is kinda unreachable as there will be an error in the above line  ");

        }
        // Catch can be multiple
        catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("This is the Array index out of bound exception " + ai);

        } catch (NullPointerException ne) {
            System.out.println("Nullpointer error " + ne);

        } catch (Exception e) {
            System.out.println("This is general exception ");
            System.out.println("The Error we caught  " + e);
        } finally {
            System.out.println("This will be executed nonetheless ");

        }

    }
}

// What is Exception in Java ??
// It is a mechanism in java to handle runtime errors , allowing the normal flow
// of the program to continue
// Another way to put is that exception is an error but it does not stop the
// program entirely and is recoverable

// So what is difference between error "error" and exception ??
// Error cannot be recovered and is like fatal end from which the program cannot
// recover like out of memory error .
// Meanwhile exception can be predicted and the program after throwing them the
// program can run.

// Difference between Checked and Unchecked exception ??
// Checked Exception: These are the ones that would occur at the compile before
// the program even starts running
// The programmer should think about them before and mention or implement them
// directly
// Unchecked Exception: These mainly occur at run time and they programmer
// doesn't need to explicitly mention or implement them

// An example for each of them. 
// For un checked exception there is this whole program. It is full of un checked. 

// now let's say instead of using Scanner , i used parse to get input from user but i didn't pass the input at the compile. So to avoid them we do . 

// public static void main(String[] args) {
//     try {
//          int a=Integer.parseInt(args[0]);
//     } catch (Exception e) {
//        System.out.println("The Error is "+e);
//        a=10;
//     }
   
// }