import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class p7 {

    public static void main(String[] args) {

        Map<String, Integer> freqMap = new HashMap<>();

        // 1️⃣ Read file
        try (BufferedReader br = new BufferedReader(new FileReader("demo.text"))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase
                line = line.toLowerCase();

                // Remove punctuation
                line = line.replaceAll("[^a-z0-9\\s]", "");

                // Split into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;

                    freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.out.println("IO Error: " + e);
            return;
        }

        // 2️⃣ Sort by frequency (descending)
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(freqMap.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        // 3️⃣ Print result
        System.out.println("Word Frequency (High → Low):");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
