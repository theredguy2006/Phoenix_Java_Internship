
import java.util.HashMap;
import java.util.Map;

public class p2 {
    public static void main(String[] args) {
        // Focusing
        HashMap<String, Integer> hashMap = new HashMap<>();

        // hm.add("kaif",90);
        hashMap.put("kaif", 90);
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);
        hashMap.putIfAbsent("None", 121);
        System.out.println("Checking PutIfAbsent " + hashMap.putIfAbsent("None", 121));
        System.out.println("So bascially if the value is there it returns the value or else it would return null ");
        System.out.println("Checking PutIfAbsent " + hashMap.putIfAbsent("None1", 111));
        System.out.println("Printing the HM " + hashMap);
        // The Capacity of HashMap is 16 and after 16 it is
        // new capacity=old capacity×2
        // Default threshold is 0.75 and after that it doubles automatically.

        // Some more ways to initialize hashMap
        // HashMap<K, V> hm = new HashMap<K, V>(Map map); Here map is a different
        // hashmap which is used to initialize the current HM with it's value
        // HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity);

        hashMap.remove(0);
        // Remove By Index

        hashMap.put("kaif", 12901);

        System.out.println("After Changing Value " + hashMap);

        // To use "for" Loop for HashMap
        for (Map.Entry<String, Integer> e : hashMap.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());

        System.out.println("For Each method/fucntion forEach by Lambda Function ");
        hashMap.forEach((k, v) -> {
            if (v >= 30)
                System.out.println(k + " -> " + v);
        });

    }

}

// TIme complexity and Space Complexity is constant for basic operations
// O(1) & O(N)

// Difference between "Collection" and "Collections"
// Collection is an interface and the methods which are used by
// Collections(ArrayList , LinkedList , Hash Map and Set )