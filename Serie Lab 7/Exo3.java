/*Exercise 3:
1. Declare and Initialise Sets:
● Declare a set of integers using the HashSet implementation and initialise it with the following
elements: 10, 20, 30, 10, 20.
● Declare a set of strings using the TreeSet implementation and initialise it with the following
elements: "apple", "banana", "cherry", "apple", "banana".

2. Manipulate Sets:
● Try to add duplicate elements (e.g. 20 for the integer set, and "banana" for the string set) to the
sets and observe what happens.
● Remove a specific element from each set (e.g. 10 from the integer set and "cherry" from the
string set).
3. Traverse Sets:
● Use an iterator to traverse each set and print each element in the integer and string sets.
4. Explore Set Implementations:
● Print the contents of each set to observe the differences in order between HashSet and
TreeSet.
● For the TreeSet, demonstrate the use of the first() and last() methods to retrieve the first
and last elements in the set. */
import java.util.*;

public class Exo3 {
    public static void main(String[] args) {
        // 1. Declare and Initialise Sets
            // HashSet of integers
            Set<Integer> intSet = new HashSet<>(Arrays.asList(10, 20, 30, 10, 20));
            // TreeSet of strings
            Set<String> strSet = new TreeSet<>(Arrays.asList("apple", "banana", "cherry", "apple", "banana"));

        // 2. Manipulate Sets
            // Try to add duplicate elements
            boolean addedInt = intSet.add(20); // ignores the add value 
            boolean addedStr = strSet.add("banana");

            // Remove a specific element
            boolean removedInt = intSet.remove(10);
            boolean removedStr = strSet.remove("cherry");

        // 3. Traverse Sets
            // Use an iterator to traverse each set and print each element
            System.out.println("Integer set elements (HashSet):");
            Iterator<Integer> intIterator = intSet.iterator();
            while (intIterator.hasNext()) {
                System.out.println(intIterator.next());
            }

            System.out.println("\nString set elements (TreeSet):");
            Iterator<String> strIterator = strSet.iterator();
            while (strIterator.hasNext()) {
                System.out.println(strIterator.next());
            }

        // 4. Explore Set Implementations
            // Print the contents of each set to observe the differences in order
            System.out.println("\nContents of HashSet (intSet): " + intSet);
            System.out.println("Contents of TreeSet (strSet): " + strSet);

            // For the TreeSet, demonstrate the use of the first() and last() methods
            if (!strSet.isEmpty()) {
                System.out.println("\nFirst element in TreeSet: " + ((TreeSet<String>) strSet).first());
                System.out.println("Last element in TreeSet: " + ((TreeSet<String>) strSet).last());
            }

            // Additional check to see if duplicate add was successful or not
            System.out.println("\nAttempt to add duplicate to intSet (20): " + addedInt);
            System.out.println("Attempt to add duplicate to strSet (banana): " + addedStr);

            // Additional check to see if elements were successfully removed
            System.out.println("\nAttempt to remove from intSet (10): " + removedInt);
            System.out.println("Attempt to remove from strSet (cherry): " + removedStr);
        }
}
