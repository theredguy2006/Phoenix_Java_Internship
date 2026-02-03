import java.util.HashSet;
import java.util.Iterator;

public class p1 {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> hs = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();

        // Add elements to the HashSet
        hs.add("A");
        hs.add("A");
        hs.add("A");
        hs.add("A");
        // If the value is not present it will add the value or else return false.
        hs.add("A");
        hs.add("B");
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Z");
        hs.add("Z");
        hs.add("Z");
        hs.add("Z");
        hs.add("Z");

        // Using iterator() method to iterate Over the HashSet
        System.out.print("Using iterator : ");
        Iterator<String> iterator = hs.iterator();

        // Traversing HashSet
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");

        System.out.println();
        // Hash Set and get initialized via any Collection.
        // Hash Set Doesn't allow any Duplicate Values.
        // Hash Set Is not thread safe so to make it thread safe synchronization is
        // needed.
        System.out.println("As said above Hash Set doesn't allow Repeatation " + hs);
        // Initial Capacity of HashSet is 16 but after that it goes by new cap=old cap
        // x2
        // Load Factor is way measure that controls how full the hashset can get before
        // resizing.
        // The default the load factor is 0.75 after that it goes
        // Threshold=capacityxLoad Factor.

        // Methods of Hash Set.

        // Time Complexity Of HashSet O(1)

        System.out.println("Is Empty ?? for HS2 " + hs2.isEmpty());
        System.out.println("Is Empty ?? for HS1" + hs.isEmpty());
        System.out.println("After removing None " + hs.remove("None"));
        // It will return false as None does not exist in the following time element
        System.out.println("After removing A from HS " + hs.remove("A"));
        System.out.println();

        System.out.println("After removing A from HS " + hs);
        System.out.println("Using Size Method for HS " + hs.size());
        System.out.println("Does HS Contains Geeks ??  " + hs.contains("Geeks"));
        // It will return true if the element is removed

        hs.clear();
        System.out.println("After Clearing HS " + hs);
    }

}

// Learning about hash set and Hash Map in this program.