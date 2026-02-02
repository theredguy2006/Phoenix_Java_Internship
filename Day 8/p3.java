
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class p3 {
    // Learning about collections framework.
    // I am gonna focus on ArrayList in this program.
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // ArrayList<Data Type> al=new ArrayList<Data Type >(Initial Length || Existing
        // Collection );
        al.add(100);
        int a = 1212;
        al.add(a);
        ArrayList<Integer> al2 = new ArrayList<>(al);
        al.add(13193);
        al.add(1, 101);

        System.out.println("Array List one " + al);
        System.out.println("Array List Two  " + al2);
        // al.remove(100); this will give error indeout of bound
        // cause remove works via index input.
        al.remove(1);
        System.out.println("After removing ");
        System.out.println("\n Array List one " + al);
        System.out.println("Array List Two  " + al2);
        // al.set(5, a);Index out of bound error
        al.set(2, a);
        // al.set(index, value to be updated);
        // This will replace the following value with the given value and index.
        System.out.println("After using Set ");
        al.add(99);
        System.out.println("Array List one " + al);
        System.out.println("Array List Two  " + al2);
        al.add(99);
        al.retainAll(al2);
        System.out.println("Using Retian all " + al);

        al2.add(1212);
        al2.add(4343);
        al2.add(564);
        al2.add(78768);

        System.out.println("Array Two " + al2);
        System.out.println("Array One " + al);

        al2.forEach((i -> {
            if (i > 100) {
                System.out.println("Printing greater than 100  " + i);
            }
        }));

        // al.forEach(i(element name given temporary)-> the execution you want to do ,
        // like it can sop i*i and apply if condition and all )
        System.out.println("Array One " + al);
        // al2.removeIf(i->(i>100));
        // Same as for each but it will remove the element
        // System.out.println("Al2 after remove if "+al2);

        // Add by Index .
        // We can see that changing AL one does not effect array two.

        System.out.println("Element from 0 to 2" + al2.subList(0, 2));

        System.out.println("Element at 2 in AL 1 " + al.get(2));

        // There are many more methods such . isEmpty, toArray , contains() ,

        // We can do that too . Like
        LinkedList<Integer> ll = new LinkedList<>(al2);
        LinkedList<Integer> ll2 = new LinkedList<>(al2);
        ArrayList<Integer> al3 = new ArrayList<>(ll2);

        // Most of the methods for Array list and Linked List are same.

        System.out.println("Remove first " + ll.pollFirst());
        System.out.println("Remove Last  " + ll.pollLast());
        // These two will return first and last and then remove it.
        // ll.pop() will return from the list. at the front most probably.
        // ll.push() will return from the list. at the end most probably.

        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()) {
            System.out.println("ELement of al " + itr.next());

        }

    }

}

// What are collection framework in java .
// Basically a feature of java made by set of classes and pre made data sets and
// structure.
// Such as ArrayList , LinkedList and all.

// What is the differnece between LL and AL

// AL uses Dynamic array list while LL uses Doubly Linked List
// AL is faster than LL O(1) vs O(n)
// AL's memory is lower than LL
// Al's iteration is faster
// AL's insert and deletion is faster than LL

// What is Iterator ??
// It is a part of collections framework
// Here are some of the points of Iterator
// It is used to traverse elements in the forward direction only.
// Removes elements safely during traversal using remove().
// Iterator is a universal cursor that applies to all collection types — List,
// Set, and Queue.

// Iterator isn't mostly used now adays cause for each loop already exists and
// is more accesible but it doesn't have the remove() option