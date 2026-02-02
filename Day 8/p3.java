
import java.util.ArrayList;

public class p3 {
    // Learning about collections framework.
    // I am gonna focus on ArrayList in this program.
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        // ArrayList<Data Type> al=new ArrayList<Data Type >(Initial Length || Existing Collection );
        al.add(100);
        int a = 1212;
        al.add(a);
        ArrayList<Integer> al2 = new ArrayList<>(al); 
        al.add(13193);

        System.out.println("Array List one "+al);
        System.out.println("Array List Two  "+al2);

    }

}

// What are collection framework in java .
// Basically a feature of java made by set of classes and pre made data sets and
// structure.
// Such as ArrayList , LinkedList and all.
