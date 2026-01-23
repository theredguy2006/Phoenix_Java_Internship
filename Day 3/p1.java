import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // This is the first program of the day. Revising basic concepts and syntaxes
        int[] a = new int[3];
        // for(int i=0;i<=4;i++)
        // The above will give error -> array out of bound.
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Number for element " + i + " ");
            a[i] += i;
            // a[i]=sc.nextInt();
        }
        System.out
                .println("This is the array but it will not be array but it's object number or reference number  " + a);
        System.out.println("This will print the actual array " + Arrays.toString(a));
        // The Following are some method of array.
        System.out.println("Length of Array " + a.length);
        // We can use int[]c=a.clone(); but it wont't provide us this feature of copying
        // array
        // partially.
        // int[] c = Arrays.copyOfRange(a, 1, 3);
        int[] c = new int[3];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        System.out.println("Cloning Array c from array a" + Arrays.toString(c));
        System.out.println("Length of Array a " + a.length);
        System.out.println("Length of Array c " + c.length);

        // Some more ways to initialize and store arrays including multidimensional and
        // all.
        int[][] b = new int[3][3];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] += j;
            }
        }
        int[][] b2 = new int[3][3];
        // int[][] b2 = Arrays.copyOf(b, b.length);
        // It is a 3x3 cross matric array in java.
        // deepToString automatically traverses the array throughout so as a result we
        // don't need to
        // use nested loop or any other method.

        // If i use copyOf or clone method it would also copy the reference number of
        // original array so if i change a value of orginal array the cloned array will
        // be changed too. This is Vice verca and not just dependent on the original
        // array.

        // Using for loops to clone array b so that i can use different methods and all.
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b2[i][j] = b[i][j];
            }
        }

        Random rn = new Random();
        b[1][1] = rn.nextInt(0, 100);
        b2[0][1] = rn.nextInt(0, 100) + 12;
        System.out.println("Arrays B " + Arrays.deepToString(b));
        System.out.println("Arrays b2  " + Arrays.deepToString(b2));

        // Now focusing on other utilities and all.
        // For 1d we can just write simple equals .
        System.out.println(" Deep Equal this is good for >1d Arrays " + Arrays.deepEquals(b, b2));
        // System.out.println(" Mismatch "+Arrays.mismatch(b, b2));
        // It doesn't work properly or deeply for >1d arrays but let's see for simple
        // arrays.
        System.out.println(" Mismatch for no changed array   " + Arrays.mismatch(a, c));
        ;
        c[2] = rn.nextInt(100);
        System.out.println(" Mismatch Afer Changing " + Arrays.mismatch(a, c));

        System.out.println(" Compare method "+Arrays.compare(a,c));
        // Compare is almost same as equal but the big and only difference is that 
        // it returns -1 if first is smaller than the second one. 
        // it returns 0 if both are equal and 1 if second one is greater.
        // System.out.println(" Sort method "+ Arrays.sort(c));
        // We can't use arrays.sort directly while soping cause it returns void
        Arrays.sort(c);
        // Arrays.fill(c,20); This will all the values with 20 only . 
        // Arrays.fill(array, start, end, value) this is the structure of this method
        System.out.println(" After sorting and using the fill method "+Arrays.toString(c));
        // Arrays.sort(element, start postion from where you want to sort , till where do you want )
        sc.close();
    }
}