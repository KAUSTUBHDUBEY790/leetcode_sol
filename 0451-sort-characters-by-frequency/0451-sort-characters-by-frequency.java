import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        // Create a HashMap to count the frequency of each character
        HashMap<Character, Integer> a = new HashMap<>();
        for (char i : s.toCharArray()) {
            a.put(i, a.getOrDefault(i, 0) + 1);
        }

        // Use a PriorityQueue to sort characters by frequency in descending order
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (e1, e2) -> e2.getValue() - e1.getValue()
        );
        maxHeap.addAll(a.entrySet());

        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
