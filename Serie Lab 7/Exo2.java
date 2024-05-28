import java.util.*;

public class Exo2 {
    public static void main(String[] args) {
        // Initializing the collections
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40));
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // 2. Manipulate Collections
        // Add a new element to the list: "date"
        list.add("date");

        // Try to add a duplicate element to the set: 30
        set.add(30);

        // Add a new key-value pair to the map: "date" -> 4
        map.put("date", 4);

        // 3. Traverse Collections
        // Use a for-each loop to traverse the list and print each element
        System.out.println("List elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // Use an iterator to traverse the set and print each element
        System.out.println("\nSet elements:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Use a for-each loop to traverse the map and print each key-value pair
        System.out.println("\nMap elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. Perform Operations on Collections
        // Sort the list alphabetically and print the sorted list
        Collections.sort(list);
        System.out.println("\nSorted list elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // Calculate the sum of all elements in the set and print the result
        int sum = 0;
        for (int num : set) {
            sum += num;
        }
        System.out.println("\nSum of set elements: " + sum);

        // Check if the map contains the key "cherry" and print the corresponding value
        if (map.containsKey("cherry")) {
            System.out.println("\nThe value for key 'cherry' is: " + map.get("cherry"));
        } else {
            System.out.println("\nThe key 'cherry' is not in the map.");
        }
    }
}
